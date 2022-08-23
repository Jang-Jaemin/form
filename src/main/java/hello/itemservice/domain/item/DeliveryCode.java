// 배송 방식
package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FAST: 빠른 배송
 * NORMAL: 일반 배송
 * SLOW: 느린 배송
 */
@Data
@AllArgsConstructor
public class DeliveryCode {

    private String code;
    private String displayName;

}
//  배송방식은DeliveryCode라는 클래스를 사용한다.
//  code는 FAST 같은 시스템에서 전달하는 값이고,
//  displayName은 빠른 배송같은고객에게보여주는값이다.