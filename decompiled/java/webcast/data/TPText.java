package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TPText {

    @C09CT("format")
    public TPFormat format;

    @C09CT("key")
    public String key = "";

    @C09CT("string_value")
    public String stringValue = "";

    @C09CT("pieces")
    public List<TPTextPiece> pieces = new ArrayList();

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();
}
