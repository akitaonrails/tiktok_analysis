package webcast.api.room_live_studio;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SupplierDetail {

    @C09CT("contact_method")
    public int contactMethod;

    @C09CT("logo")
    public ImageUrlSet logo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("supplier_id")
    public long supplierId;

    @C09CT("tier")
    public int tier;

    @C09CT("name")
    public String name = "";

    @C09CT("intro")
    public String intro = "";

    @C09CT("gallery_image_urls")
    public List<String> galleryImageUrls = new ArrayList();

    @C09CT("products")
    public List<ProductCard> products = new ArrayList();

    @C09CT("logo_url")
    public String logoUrl = "";

    @C09CT("contact_person")
    public String contactPerson = "";

    @C09CT("contact_info")
    public String contactInfo = "";

    @C09CT("official_website")
    public String officialWebsite = "";

    @C09CT("gallery_images")
    public List<ImageUrlSet> galleryImages = new ArrayList();
}
