package webcast.data.host_board;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BoardCell {

    @C09CT("alignment")
    public int alignment;

    @C09CT("bottom_padding")
    public int bottomPadding;

    @C09CT("click_action")
    public ClickAction clickAction;

    @C09CT("icon")
    public TuxIcon icon;

    @C09CT("image")
    public ImageModel image;

    @C09CT("image_style")
    public ImageStyle imageStyle;

    @C09CT("nonfoldable")
    public boolean nonfoldable;

    @C09CT("padding")
    public Padding padding;

    @C09CT("params_data")
    public byte[] paramsData;

    @C09CT("text_style")
    public TextStyle textStyle;

    @C09CT("type")
    public String type = "";

    @C09CT("text")
    public String text = "";

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    public final int hashCode() {
        int iZ2 = ((((((((this.alignment * 31) + this.bottomPadding) * 31) + C786410Ut5.Z2(this.nonfoldable)) * 31) + this.type.hashCode()) * 31) + this.text.hashCode()) * 31;
        TuxIcon tuxIcon = this.icon;
        int iHashCode = (iZ2 + (tuxIcon != null ? tuxIcon.hashCode() : 0)) * 31;
        ImageModel imageModel = this.image;
        int iHashCode2 = (iHashCode + (imageModel != null ? imageModel.hashCode() : 0)) * 31;
        ClickAction clickAction = this.clickAction;
        int iHashCode3 = (((iHashCode2 + (clickAction != null ? clickAction.hashCode() : 0)) * 31) + this.id.hashCode()) * 31;
        Padding padding = this.padding;
        int iHashCode4 = (iHashCode3 + (padding != null ? padding.hashCode() : 0)) * 31;
        TextStyle textStyle = this.textStyle;
        int iHashCode5 = (iHashCode4 + (textStyle != null ? textStyle.hashCode() : 0)) * 31;
        ImageStyle imageStyle = this.imageStyle;
        return ((iHashCode5 + (imageStyle != null ? imageStyle.hashCode() : 0)) * 31) + Arrays.hashCode(this.paramsData);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(BoardCell.class, cls)) {
            return false;
        }
        BoardCell boardCell = (BoardCell) obj;
        if (this.alignment == boardCell.alignment && this.bottomPadding == boardCell.bottomPadding && this.nonfoldable == boardCell.nonfoldable && Intrinsics.LJFF(this.type, boardCell.type) && Intrinsics.LJFF(this.text, boardCell.text) && Intrinsics.LJFF(this.icon, boardCell.icon) && Intrinsics.LJFF(this.image, boardCell.image) && Intrinsics.LJFF(this.clickAction, boardCell.clickAction) && Intrinsics.LJFF(this.id, boardCell.id) && Intrinsics.LJFF(this.padding, boardCell.padding) && Intrinsics.LJFF(this.textStyle, boardCell.textStyle) && Intrinsics.LJFF(this.imageStyle, boardCell.imageStyle) && Arrays.equals(this.paramsData, boardCell.paramsData)) {
            return true;
        }
        return false;
    }
}
