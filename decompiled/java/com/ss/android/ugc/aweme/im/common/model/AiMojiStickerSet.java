package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC449850HkV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class AiMojiStickerSet implements InterfaceC449850HkV, Serializable {

    @C09CT("creator_uid")
    public final Long creatorUid;

    @C09CT("expressions")
    public final List<String> expressions;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    @C09CT("set_id")
    public final Long setId;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("sticker_url")
    public final StickerUrlStruct stickerUrl;

    public AiMojiStickerSet() {
        this(null, null, null, null, null, null);
    }

    public final AiMojiStickerSet copy(Long l, Long l2, Integer num, StickerUrlStruct stickerUrlStruct, List<String> list, Long l3) {
        return new AiMojiStickerSet(l, l2, num, stickerUrlStruct, list, l3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiMojiStickerSet)) {
            return false;
        }
        AiMojiStickerSet aiMojiStickerSet = (AiMojiStickerSet) obj;
        return Intrinsics.LJFF(this.id, aiMojiStickerSet.id) && Intrinsics.LJFF(this.setId, aiMojiStickerSet.setId) && Intrinsics.LJFF(this.stickerType, aiMojiStickerSet.stickerType) && Intrinsics.LJFF(this.stickerUrl, aiMojiStickerSet.stickerUrl) && Intrinsics.LJFF(this.expressions, aiMojiStickerSet.expressions) && Intrinsics.LJFF(this.creatorUid, aiMojiStickerSet.creatorUid);
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.setId;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.stickerType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct = this.stickerUrl;
        int iHashCode4 = (iHashCode3 + (stickerUrlStruct == null ? 0 : stickerUrlStruct.hashCode())) * 31;
        List<String> list = this.expressions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l3 = this.creatorUid;
        return iHashCode5 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiMojiStickerSet(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", setId=");
        sbLIZ.append(this.setId);
        sbLIZ.append(", stickerType=");
        sbLIZ.append(this.stickerType);
        sbLIZ.append(", stickerUrl=");
        sbLIZ.append(this.stickerUrl);
        sbLIZ.append(", expressions=");
        sbLIZ.append(this.expressions);
        sbLIZ.append(", creatorUid=");
        sbLIZ.append(this.creatorUid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SetSticker toSetSticker() {
        Long l = this.id;
        Long l2 = this.setId;
        Integer num = this.stickerType;
        return new SetSticker(l, null, this.stickerUrl, null, null, l2, this.creatorUid, num, this.expressions, null, null, null, null);
    }

    public final Long getCreatorUid() {
        return this.creatorUid;
    }

    public final List<String> getExpressions() {
        return this.expressions;
    }

    public final Long getId() {
        return this.id;
    }

    public final Long getSetId() {
        return this.setId;
    }

    public final Integer getStickerType() {
        return this.stickerType;
    }

    public final StickerUrlStruct getStickerUrl() {
        return this.stickerUrl;
    }

    public AiMojiStickerSet(Long l, Long l2, Integer num, StickerUrlStruct stickerUrlStruct, List<String> list, Long l3) {
        this.id = l;
        this.setId = l2;
        this.stickerType = num;
        this.stickerUrl = stickerUrlStruct;
        this.expressions = list;
        this.creatorUid = l3;
    }
}
