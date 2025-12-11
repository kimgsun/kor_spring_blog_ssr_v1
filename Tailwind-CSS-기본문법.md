# Tailwind CSS 기본 문법 가이드

## Tailwind CSS란?

**Tailwind CSS**는 유틸리티 우선(Utility-First) CSS 프레임워크입니다.

**유틸리티 우선이 뭔가요?**
- 미리 만들어진 작은 CSS 클래스들을 조합해서 사용하는 방식
- 예: `p-3`, `text-center`, `bg-blue-500` 등
- 각 클래스가 하나의 스타일을 담당해요

**왜 Tailwind를 쓰나요?**
- 빠르게 스타일링 가능
- 일관된 디자인 시스템
- 반응형 디자인이 쉬움
- 커스텀 CSS를 적게 작성

---

## 기본 사용법

### 클래스 이름 규칙

Tailwind 클래스는 다음과 같은 패턴을 따릅니다:
```
{속성}-{값}
```

**예시**:
- `p-3`: padding 3 (패딩 3단위)
- `text-center`: text-align center (텍스트 중앙 정렬)
- `bg-blue-500`: background blue-500 (파란색 배경)

---

## 1. Spacing (간격)

### Padding (안쪽 여백)

```html
<!-- 모든 방향 -->
<div class="p-0">p-0</div>   <!-- padding: 0 -->
<div class="p-1">p-1</div>   <!-- padding: 0.25rem (4px) -->
<div class="p-2">p-2</div>   <!-- padding: 0.5rem (8px) -->
<div class="p-3">p-3</div>   <!-- padding: 0.75rem (12px) -->
<div class="p-4">p-4</div>   <!-- padding: 1rem (16px) -->
<div class="p-5">p-5</div>   <!-- padding: 1.25rem (20px) -->
<div class="p-6">p-6</div>   <!-- padding: 1.5rem (24px) -->
<div class="p-8">p-8</div>   <!-- padding: 2rem (32px) -->
<div class="p-10">p-10</div> <!-- padding: 2.5rem (40px) -->
<div class="p-12">p-12</div> <!-- padding: 3rem (48px) -->

<!-- 개별 방향 -->
<div class="pt-4">pt-4</div>  <!-- padding-top -->
<div class="pr-4">pr-4</div>  <!-- padding-right -->
<div class="pb-4">pb-4</div>  <!-- padding-bottom -->
<div class="pl-4">pl-4</div>  <!-- padding-left -->

<!-- 가로/세로 -->
<div class="px-4">px-4</div>  <!-- padding-left + padding-right -->
<div class="py-4">py-4</div>  <!-- padding-top + padding-bottom -->
```

**값 범위**: 0, 0.5, 1, 1.5, 2, 2.5, 3, 3.5, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 72, 80, 96

### Margin (바깥쪽 여백)

```html
<!-- 모든 방향 -->
<div class="m-0">m-0</div>   <!-- margin: 0 -->
<div class="m-1">m-1</div>   <!-- margin: 0.25rem -->
<div class="m-2">m-2</div>   <!-- margin: 0.5rem -->
<div class="m-3">m-3</div>   <!-- margin: 0.75rem -->
<div class="m-4">m-4</div>   <!-- margin: 1rem -->
<div class="m-5">m-5</div>   <!-- margin: 1.25rem -->
<div class="m-6">m-6</div>   <!-- margin: 1.5rem -->
<div class="m-8">m-8</div>   <!-- margin: 2rem -->

<!-- 개별 방향 -->
<div class="mt-4">mt-4</div>  <!-- margin-top -->
<div class="mr-4">mr-4</div>  <!-- margin-right -->
<div class="mb-4">mb-4</div>  <!-- margin-bottom -->
<div class="ml-4">ml-4</div>  <!-- margin-left -->

<!-- 가로/세로 -->
<div class="mx-4">mx-4</div>  <!-- margin-left + margin-right -->
<div class="my-4">my-4</div>  <!-- margin-top + margin-bottom -->

<!-- 자동 마진 (중앙 정렬에 유용) -->
<div class="mx-auto">mx-auto</div>  <!-- margin-left: auto; margin-right: auto; -->
```

**음수 마진**:
```html
<div class="-m-4">-m-4</div>  <!-- margin: -1rem -->
<div class="-mt-4">-mt-4</div> <!-- margin-top: -1rem -->
```

---

## 2. Typography (텍스트)

### 텍스트 크기

```html
<p class="text-xs">text-xs</p>    <!-- font-size: 0.75rem (12px) -->
<p class="text-sm">text-sm</p>    <!-- font-size: 0.875rem (14px) -->
<p class="text-base">text-base</p> <!-- font-size: 1rem (16px) -->
<p class="text-lg">text-lg</p>    <!-- font-size: 1.125rem (18px) -->
<p class="text-xl">text-xl</p>    <!-- font-size: 1.25rem (20px) -->
<p class="text-2xl">text-2xl</p>  <!-- font-size: 1.5rem (24px) -->
<p class="text-3xl">text-3xl</p>  <!-- font-size: 1.875rem (30px) -->
<p class="text-4xl">text-4xl</p>  <!-- font-size: 2.25rem (36px) -->
<p class="text-5xl">text-5xl</p>  <!-- font-size: 3rem (48px) -->
<p class="text-6xl">text-6xl</p>  <!-- font-size: 3.75rem (60px) -->
<p class="text-7xl">text-7xl</p>  <!-- font-size: 4.5rem (72px) -->
<p class="text-8xl">text-8xl</p>  <!-- font-size: 6rem (96px) -->
<p class="text-9xl">text-9xl</p>  <!-- font-size: 8rem (128px) -->
```

### 텍스트 정렬

```html
<p class="text-left">text-left</p>     <!-- text-align: left -->
<p class="text-center">text-center</p> <!-- text-align: center -->
<p class="text-right">text-right</p>   <!-- text-align: right -->
<p class="text-justify">text-justify</p> <!-- text-align: justify -->
```

### 텍스트 굵기

```html
<p class="font-thin">font-thin</p>      <!-- font-weight: 100 -->
<p class="font-extralight">font-extralight</p> <!-- font-weight: 200 -->
<p class="font-light">font-light</p>    <!-- font-weight: 300 -->
<p class="font-normal">font-normal</p>   <!-- font-weight: 400 -->
<p class="font-medium">font-medium</p> <!-- font-weight: 500 -->
<p class="font-semibold">font-semibold</p> <!-- font-weight: 600 -->
<p class="font-bold">font-bold</p>      <!-- font-weight: 700 -->
<p class="font-extrabold">font-extrabold</p> <!-- font-weight: 800 -->
<p class="font-black">font-black</p>    <!-- font-weight: 900 -->
```

### 텍스트 색상

```html
<p class="text-black">text-black</p>
<p class="text-white">text-white</p>
<p class="text-gray-500">text-gray-500</p>
<p class="text-red-500">text-red-500</p>
<p class="text-blue-500">text-blue-500</p>
<p class="text-green-500">text-green-500</p>
<p class="text-yellow-500">text-yellow-500</p>
<p class="text-purple-500">text-purple-500</p>
```

**색상 값**: 50, 100, 200, 300, 400, 500, 600, 700, 800, 900

### 텍스트 장식

```html
<p class="underline">underline</p>        <!-- text-decoration: underline -->
<p class="line-through">line-through</p>  <!-- text-decoration: line-through -->
<p class="no-underline">no-underline</p> <!-- text-decoration: none -->
```

### 텍스트 변환

```html
<p class="uppercase">uppercase</p>  <!-- text-transform: uppercase -->
<p class="lowercase">lowercase</p>  <!-- text-transform: lowercase -->
<p class="capitalize">capitalize</p> <!-- text-transform: capitalize -->
<p class="normal-case">normal-case</p> <!-- text-transform: none -->
```

---

## 3. Colors (색상)

### 배경색

```html
<div class="bg-white">bg-white</div>
<div class="bg-black">bg-black</div>
<div class="bg-gray-100">bg-gray-100</div>
<div class="bg-red-500">bg-red-500</div>
<div class="bg-blue-500">bg-blue-500</div>
<div class="bg-green-500">bg-green-500</div>
<div class="bg-yellow-500">bg-yellow-500</div>
<div class="bg-purple-500">bg-purple-500</div>
<div class="bg-pink-500">bg-pink-500</div>
<div class="bg-indigo-500">bg-indigo-500</div>
```

### 텍스트 색상

```html
<p class="text-gray-900">text-gray-900</p>
<p class="text-red-600">text-red-600</p>
<p class="text-blue-600">text-blue-600</p>
```

### 테두리 색상

```html
<div class="border border-red-500">border border-red-500</div>
<div class="border-2 border-blue-500">border-2 border-blue-500</div>
```

---

## 4. Layout (레이아웃)

### Display

```html
<div class="block">block</div>        <!-- display: block -->
<div class="inline-block">inline-block</div> <!-- display: inline-block -->
<div class="inline">inline</div>       <!-- display: inline -->
<div class="flex">flex</div>          <!-- display: flex -->
<div class="inline-flex">inline-flex</div> <!-- display: inline-flex -->
<div class="grid">grid</div>          <!-- display: grid -->
<div class="hidden">hidden</div>      <!-- display: none -->
```

### Flexbox

```html
<!-- Flex 컨테이너 -->
<div class="flex">flex</div>
<div class="flex-row">flex-row</div>      <!-- flex-direction: row -->
<div class="flex-col">flex-col</div>       <!-- flex-direction: column -->
<div class="flex-wrap">flex-wrap</div>     <!-- flex-wrap: wrap -->
<div class="flex-nowrap">flex-nowrap</div> <!-- flex-wrap: nowrap -->

<!-- 정렬 -->
<div class="justify-start">justify-start</div>   <!-- justify-content: flex-start -->
<div class="justify-center">justify-center</div>  <!-- justify-content: center -->
<div class="justify-end">justify-end</div>       <!-- justify-content: flex-end -->
<div class="justify-between">justify-between</div> <!-- justify-content: space-between -->
<div class="justify-around">justify-around</div> <!-- justify-content: space-around -->
<div class="justify-evenly">justify-evenly</div> <!-- justify-content: space-evenly -->

<div class="items-start">items-start</div>   <!-- align-items: flex-start -->
<div class="items-center">items-center</div> <!-- align-items: center -->
<div class="items-end">items-end</div>       <!-- align-items: flex-end -->
<div class="items-stretch">items-stretch</div> <!-- align-items: stretch -->

<!-- Flex 아이템 -->
<div class="flex-1">flex-1</div>        <!-- flex: 1 1 0% -->
<div class="flex-auto">flex-auto</div> <!-- flex: 1 1 auto -->
<div class="flex-none">flex-none</div>  <!-- flex: none -->
```

### Grid

```html
<!-- Grid 컨테이너 -->
<div class="grid grid-cols-1">grid-cols-1</div>  <!-- grid-template-columns: repeat(1, minmax(0, 1fr)) -->
<div class="grid grid-cols-2">grid-cols-2</div>  <!-- 2열 -->
<div class="grid grid-cols-3">grid-cols-3</div>  <!-- 3열 -->
<div class="grid grid-cols-4">grid-cols-4</div>  <!-- 4열 -->
<div class="grid grid-cols-12">grid-cols-12</div> <!-- 12열 -->

<!-- 간격 -->
<div class="gap-4">gap-4</div>        <!-- gap: 1rem -->
<div class="gap-x-4">gap-x-4</div>    <!-- column-gap: 1rem -->
<div class="gap-y-4">gap-y-4</div>   <!-- row-gap: 1rem -->
```

### Position

```html
<div class="static">static</div>      <!-- position: static -->
<div class="fixed">fixed</div>        <!-- position: fixed -->
<div class="absolute">absolute</div>   <!-- position: absolute -->
<div class="relative">relative</div>   <!-- position: relative -->
<div class="sticky">sticky</div>      <!-- position: sticky -->
```

### 위치

```html
<div class="top-0">top-0</div>
<div class="right-0">right-0</div>
<div class="bottom-0">bottom-0</div>
<div class="left-0">left-0</div>
```

### 너비와 높이

```html
<!-- 너비 -->
<div class="w-auto">w-auto</div>      <!-- width: auto -->
<div class="w-full">w-full</div>      <!-- width: 100% -->
<div class="w-screen">w-screen</div>  <!-- width: 100vw -->
<div class="w-1/2">w-1/2</div>        <!-- width: 50% -->
<div class="w-1/3">w-1/3</div>        <!-- width: 33.333333% -->
<div class="w-1/4">w-1/4</div>        <!-- width: 25% -->
<div class="w-64">w-64</div>          <!-- width: 16rem (256px) -->

<!-- 높이 -->
<div class="h-auto">h-auto</div>      <!-- height: auto -->
<div class="h-full">h-full</div>      <!-- height: 100% -->
<div class="h-screen">h-screen</div>  <!-- height: 100vh -->
<div class="h-64">h-64</div>          <!-- height: 16rem -->
```

---

## 5. Borders (테두리)

### 테두리 너비

```html
<div class="border">border</div>        <!-- border-width: 1px -->
<div class="border-0">border-0</div>    <!-- border-width: 0px -->
<div class="border-2">border-2</div>    <!-- border-width: 2px -->
<div class="border-4">border-4</div>     <!-- border-width: 4px -->
<div class="border-8">border-8</div>    <!-- border-width: 8px -->
```

### 테두리 방향

```html
<div class="border-t">border-t</div>    <!-- border-top-width: 1px -->
<div class="border-r">border-r</div>    <!-- border-right-width: 1px -->
<div class="border-b">border-b</div>    <!-- border-bottom-width: 1px -->
<div class="border-l">border-l</div>    <!-- border-left-width: 1px -->
```

### 테두리 색상

```html
<div class="border-gray-300">border-gray-300</div>
<div class="border-red-500">border-red-500</div>
<div class="border-blue-500">border-blue-500</div>
```

### 테두리 모서리

```html
<div class="rounded-none">rounded-none</div>  <!-- border-radius: 0px -->
<div class="rounded-sm">rounded-sm</div>      <!-- border-radius: 0.125rem -->
<div class="rounded">rounded</div>            <!-- border-radius: 0.25rem -->
<div class="rounded-md">rounded-md</div>      <!-- border-radius: 0.375rem -->
<div class="rounded-lg">rounded-lg</div>      <!-- border-radius: 0.5rem -->
<div class="rounded-xl">rounded-xl</div>      <!-- border-radius: 0.75rem -->
<div class="rounded-2xl">rounded-2xl</div>    <!-- border-radius: 1rem -->
<div class="rounded-3xl">rounded-3xl</div>    <!-- border-radius: 1.5rem -->
<div class="rounded-full">rounded-full</div>  <!-- border-radius: 9999px -->
```

---

## 6. Effects (효과)

### 그림자

```html
<div class="shadow-sm">shadow-sm</div>    <!-- box-shadow 작음 -->
<div class="shadow">shadow</div>           <!-- box-shadow 기본 -->
<div class="shadow-md">shadow-md</div>     <!-- box-shadow 중간 -->
<div class="shadow-lg">shadow-lg</div>     <!-- box-shadow 큼 -->
<div class="shadow-xl">shadow-xl</div>      <!-- box-shadow 매우 큼 -->
<div class="shadow-2xl">shadow-2xl</div>    <!-- box-shadow 매우 매우 큼 -->
<div class="shadow-none">shadow-none</div> <!-- box-shadow: none -->
```

### 투명도

```html
<div class="opacity-0">opacity-0</div>    <!-- opacity: 0 -->
<div class="opacity-25">opacity-25</div>  <!-- opacity: 0.25 -->
<div class="opacity-50">opacity-50</div>  <!-- opacity: 0.5 -->
<div class="opacity-75">opacity-75</div>  <!-- opacity: 0.75 -->
<div class="opacity-100">opacity-100</div> <!-- opacity: 1 -->
```

---

## 7. 반응형 디자인

Tailwind는 모바일 우선(Mobile-First) 접근 방식을 사용합니다.

### 브레이크포인트

- `sm`: 640px 이상
- `md`: 768px 이상
- `lg`: 1024px 이상
- `xl`: 1280px 이상
- `2xl`: 1536px 이상

### 사용법

```html
<!-- 기본(모바일): text-sm -->
<!-- md 이상(태블릿): text-lg -->
<!-- lg 이상(데스크톱): text-xl -->
<p class="text-sm md:text-lg lg:text-xl">반응형 텍스트</p>

<!-- 기본: 1열 -->
<!-- md 이상: 2열 -->
<!-- lg 이상: 4열 -->
<div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4">
  <div>아이템 1</div>
  <div>아이템 2</div>
  <div>아이템 3</div>
  <div>아이템 4</div>
</div>

<!-- 기본: 숨김 -->
<!-- md 이상: 보임 -->
<div class="hidden md:block">태블릿 이상에서만 보임</div>
```

---

## 8. 상태 (Hover, Focus 등)

### Hover (마우스 올렸을 때)

```html
<button class="bg-blue-500 hover:bg-blue-700">버튼</button>
<div class="text-gray-500 hover:text-blue-500">링크</div>
<div class="opacity-50 hover:opacity-100">호버 시 불투명도 변경</div>
```

### Focus (포커스 받았을 때)

```html
<input class="border focus:border-blue-500 focus:outline-none">
<button class="focus:ring-2 focus:ring-blue-500">포커스 시 링 표시</button>
```

### Active (클릭했을 때)

```html
<button class="bg-blue-500 active:bg-blue-800">버튼</button>
```

### Disabled (비활성화)

```html
<button class="bg-gray-300 disabled:opacity-50" disabled>버튼</button>
```

---

## 9. 자주 사용하는 조합 예시

### 카드

```html
<div class="bg-white rounded-lg shadow-md p-6">
  <h2 class="text-2xl font-bold mb-4">카드 제목</h2>
  <p class="text-gray-600">카드 내용</p>
</div>
```

### 버튼

```html
<button class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
  버튼
</button>
```

### 컨테이너 (중앙 정렬)

```html
<div class="container mx-auto px-4">
  <!-- 내용 -->
</div>
```

### Flexbox 중앙 정렬

```html
<div class="flex items-center justify-center h-screen">
  <div>중앙에 위치</div>
</div>
```

### 그리드 레이아웃

```html
<div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
  <div class="bg-gray-100 p-4">아이템 1</div>
  <div class="bg-gray-100 p-4">아이템 2</div>
  <div class="bg-gray-100 p-4">아이템 3</div>
</div>
```

---

## 10. 유용한 팁

### 1. 여러 클래스 조합하기

```html
<div class="p-4 m-2 bg-blue-500 text-white rounded-lg shadow-md">
  여러 클래스를 조합
</div>
```

### 2. 조건부 클래스 (JavaScript와 함께)

```html
<div class="p-4 ${isActive ? 'bg-blue-500' : 'bg-gray-500'}">
  조건부 스타일
</div>
```

### 3. 커스텀 값 사용

Tailwind 설정 파일에서 커스텀 값을 추가할 수 있습니다.

### 4. JIT (Just-In-Time) 모드

Tailwind는 JIT 모드를 지원하여 사용하는 클래스만 생성합니다.
