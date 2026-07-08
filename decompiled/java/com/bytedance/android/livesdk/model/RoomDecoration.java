package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RoomDecoration extends Sticker {

    @C09CT("image")
    public ImageModel image;

    @C09CT("input_rect")
    public List<Long> inputRect;

    @C09CT("kind")
    public long kind;

    @C09CT("max_length")
    public long maxLength;

    @C09CT("sit_rect")
    public List<Double> sit_rect;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public long status;

    public RoomDecoration() {
        this(null, 0L, new ArrayList(), 0L, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoomDecoration)) {
            return false;
        }
        RoomDecoration roomDecoration = (RoomDecoration) obj;
        return Intrinsics.LJFF(this.image, roomDecoration.image) && this.maxLength == roomDecoration.maxLength && Intrinsics.LJFF(this.inputRect, roomDecoration.inputRect) && this.status == roomDecoration.status && this.kind == roomDecoration.kind && Intrinsics.LJFF(this.sit_rect, roomDecoration.sit_rect);
    }

    public final int hashCode() {
        ImageModel imageModel = this.image;
        int iHashCode = (((((((((imageModel == null ? 0 : imageModel.hashCode()) * 31) + C786410Ut5.Y2(this.maxLength)) * 31) + this.inputRect.hashCode()) * 31) + C786410Ut5.Y2(this.status)) * 31) + C786410Ut5.Y2(this.kind)) * 31;
        List<Double> list = this.sit_rect;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoomDecoration(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", maxLength=");
        sbLIZ.append(this.maxLength);
        sbLIZ.append(", inputRect=");
        sbLIZ.append(this.inputRect);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", kind=");
        sbLIZ.append(this.kind);
        sbLIZ.append(", sit_rect=");
        sbLIZ.append(this.sit_rect);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final OrganizationModel LIZ() {
        if (TextUtils.isEmpty(this.content)) {
            return null;
        }
        try {
            return (OrganizationModel) new Gson().LJII(this.content, OrganizationModel.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public RoomDecoration(ImageModel imageModel, long j, List<Long> list, long j2, long j3, List<Double> list2) {
        this.image = imageModel;
        this.maxLength = j;
        this.inputRect = list;
        this.status = j2;
        this.kind = j3;
        this.sit_rect = list2;
    }
}
