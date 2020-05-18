package org.example;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

/**
 * @author noavarice
 * @since 1.0
 */
// эта аннотация указывает, что надо сгенерировать реализацию интерфейса UserView
// реализация будет сгенерена компилятором при пересборке и называться ImmutableUserView
@Value.Immutable
// эта аннотация указывает, как Jackson должен инстанцировать объект
// по умолчанию, jackson сам видит, как проперти класса можно сматчить на проперти JSON и наоборот
// таким образом, больше ничего делать не надо
@JsonDeserialize(builder = ImmutableUserView.Builder.class)
public interface UserView {

    DataView getData();

    AdView getAd();
}
