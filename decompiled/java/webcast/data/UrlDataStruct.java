package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UrlDataStruct {

    @C09CT("url_sub_type")
    public int urlSubType;

    @C09CT("uri")
    public String uri = "";

    @C09CT("url_list")
    public List<String> urlList = new ArrayList();

    @C09CT("md5")
    public String md5 = "";

    @C09CT("url_prefix")
    public List<String> urlPrefix = new ArrayList();
}
