## Templet Method Pattern (템플릿 메소드 패턴)
- 내부구현방식은 다르지만 알고리즘이 같은 경우 템플릿으로 구성해서 특수한 구현만 서브클래스에서 구현하는 구조
- Template Method에서는 전반적인 구현은 상위클래스(주로 Abstract로 만듭니다.)에서 담당하고 부분적인 곳의 구체적인 구현은 하위클래스가 담당합니다.

<img src="pattern-template.png" align=left>