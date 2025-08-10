package javalab.ch12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// List
// 중복허용, 입력순서 유지
// 인덱스, 순차적인 저장
public class ListEx {

	public static void main(String[] args) {
		
		// List 인터페이스
		System.out.println("===== ArrayList =====");
		
		// int -> Integer
		// double -> Double
		List<Integer> array_list = new ArrayList<>();
		
		array_list.add(1); // 등록
		array_list.add(2);
		array_list.add(3);
		array_list.add(4);
		array_list.add(5);
		
		for(Integer i : array_list) {
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println(array_list.size());
		System.out.println(array_list.indexOf(3));
		System.out.println(array_list.indexOf(7)); // 없는 요소는 -1을 반환
		
		System.out.println();
		
		array_list.set(2, 7); // index 2가 7로 변경
		array_list.remove(3); // index 3 제거

		System.out.println(array_list.get(3));
		
		for(Integer i : array_list) {
			System.out.println(i);
		}
		
		array_list.clear();
		
		System.out.println("===== LinkedList =====");
		
		List<Integer> linked_list = new LinkedList<>();
		
		linked_list.add(1); // 등록
		linked_list.add(2);
		linked_list.add(3);
		linked_list.add(4);
		linked_list.add(5);
		
		for(Integer i : linked_list) {
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println(linked_list.size());
		System.out.println(linked_list.indexOf(3));
		System.out.println(linked_list.indexOf(7)); // 없는 요소는 -1을 반환
		
		System.out.println();
		
		linked_list.remove(2);
		
		System.out.println(linked_list.size());

		System.out.println(linked_list.indexOf(1));
		System.out.println(linked_list.indexOf(2));
		System.out.println(linked_list.indexOf(3));
		System.out.println(linked_list.indexOf(4));
		System.out.println(linked_list.indexOf(5));
		
		System.out.println();
		
		// 초기화 블록
		List<Integer> linked_list2 = new LinkedList<>() {
			// 이중괄호 초기화 - 익명클래스를 이용한 방법. 익명클래스가 사용한 횟수만큼 생성됨
			{add(1); add(2); add(3); add(4); add(5);}
		};
		
		linked_list2.forEach((item) -> System.out.println(item));
		
		System.out.println();
		
		// Set 인터페이스
		// - 중복을 허용하지 않음. 입력순서가 유지되지 않음
		System.out.println("===== Set =====");
		
		Set<Integer> hashSet = new HashSet<>(); // ctrl + shift + O -> 자동 import 추가
		
		hashSet.add(1); // 등록
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(3);
		hashSet.add(5);
		hashSet.add(4);
		
		for(Integer i : hashSet) {
			System.out.println(i);
		}
		
		System.out.println();
		
		hashSet.forEach((item) -> System.out.println(item));
		
		System.out.println();
		
		System.out.println(hashSet.size());
		
		
	}

}
