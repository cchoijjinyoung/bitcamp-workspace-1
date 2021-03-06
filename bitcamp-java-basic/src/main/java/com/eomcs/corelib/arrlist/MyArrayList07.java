package com.eomcs.corelib.arrlist;
// MyArrayListTest
// 1) 인스턴스를 담을 레퍼런스 배열[갯수] 를 준비한다. dafault = 10개;
// 2) 인스턴스를 추가하는 add(Object) 메서드 정의
// 3) 특정 인덱스의 인스턴스를 리턴하는 get(int) 메서드를 정의한다.
// 4) 인스턴스를 삽입하는 add(int, Object) 메서드 정의
// 5) 특정 위치의 항목을 다른 인스턴스로 바꾸는 set(int, object) 메서드 정의
// 6) 특정 위치의 항목을 제거하는 remove(int) 메서드 정의
//
// MyArrayListTest 2
// 7) add() 할때 배열의 크기를 넘는경우 배열의 크기를 증가시킨다.

public class MyArrayList07 {

  static Object[] elementData = new Object[5];
  static int size;

  static public boolean add(Object e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }
  static private void grow() {
    Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
    for(int i =0; i < elementData.length; i++) {
      newArray[i] = elementData[i];
    }
    elementData = newArray;

  }

  static public void add(int index, Object element) {
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element;
    size++;
  }

  static public Object set(int index, Object element) {
    Object old = elementData[index];
    elementData[index] = element;
    return old;
  }

  static public Object remove(int index) {
    Object old = elementData[index];
    for (int i = index; i < size - 1; i++) {
      elementData[index] = elementData[i + 1];
    }
    size--;
    return old;
  }

  static public Object get(int index) {

    return elementData[index];
  }
}
