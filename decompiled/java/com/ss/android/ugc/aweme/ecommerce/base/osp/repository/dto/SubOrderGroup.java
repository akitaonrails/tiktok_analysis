package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SubOrderGroup {

    @C09CT("about_this_shop_schema")
    public String aboutThisShopSchema;

    @C09CT("avatar")
    public Image avatar;

    @C09CT("main_order_ids")
    public List<String> mainOrderIds;

    @C09CT("seller_can_be_clicked")
    public Boolean sellerCanBeClicked;

    @C09CT("seller_id")
    public String sellerId;

    @C09CT("show_add_note")
    public Boolean showAddNote;

    @C09CT("store_label")
    public StoreLabel storeLabel;

    @C09CT("title")
    public String title;

    public SubOrderGroup() {
        this(null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubOrderGroup)) {
            return false;
        }
        SubOrderGroup subOrderGroup = (SubOrderGroup) obj;
        return Intrinsics.LJFF(this.sellerId, subOrderGroup.sellerId) && Intrinsics.LJFF(this.title, subOrderGroup.title) && Intrinsics.LJFF(this.avatar, subOrderGroup.avatar) && Intrinsics.LJFF(this.mainOrderIds, subOrderGroup.mainOrderIds) && Intrinsics.LJFF(this.showAddNote, subOrderGroup.showAddNote) && Intrinsics.LJFF(this.aboutThisShopSchema, subOrderGroup.aboutThisShopSchema) && Intrinsics.LJFF(this.sellerCanBeClicked, subOrderGroup.sellerCanBeClicked) && Intrinsics.LJFF(this.storeLabel, subOrderGroup.storeLabel);
    }

    public final int hashCode() {
        String str = this.sellerId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.avatar;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        List<String> list = this.mainOrderIds;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.showAddNote;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.aboutThisShopSchema;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.sellerCanBeClicked;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        StoreLabel storeLabel = this.storeLabel;
        return iHashCode7 + (storeLabel != null ? storeLabel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOrderGroup(sellerId=");
        sbLIZ.append(this.sellerId);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", mainOrderIds=");
        sbLIZ.append(this.mainOrderIds);
        sbLIZ.append(", showAddNote=");
        sbLIZ.append(this.showAddNote);
        sbLIZ.append(", aboutThisShopSchema=");
        sbLIZ.append(this.aboutThisShopSchema);
        sbLIZ.append(", sellerCanBeClicked=");
        sbLIZ.append(this.sellerCanBeClicked);
        sbLIZ.append(", storeLabel=");
        sbLIZ.append(this.storeLabel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SubOrderGroup(String str, String str2, Image image, List<String> list, Boolean bool, String str3, Boolean bool2, StoreLabel storeLabel) {
        this.sellerId = str;
        this.title = str2;
        this.avatar = image;
        this.mainOrderIds = list;
        this.showAddNote = bool;
        this.aboutThisShopSchema = str3;
        this.sellerCanBeClicked = bool2;
        this.storeLabel = storeLabel;
    }
}
