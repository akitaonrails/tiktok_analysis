package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TPTextPiece {

    @C09CT("countdown_config")
    public TPCountDownConfig countdownConfig;

    @C09CT("format")
    public TPFormat format;

    @C09CT("image_value")
    public TPTextPieceImage imageValue;

    @C09CT("type")
    public int type;

    @C09CT("string_value")
    public String stringValue = "";

    @C09CT("key")
    public String key = "";

    @C09CT("click_span")
    public List<TPClickableText> clickSpan = new ArrayList();
}
