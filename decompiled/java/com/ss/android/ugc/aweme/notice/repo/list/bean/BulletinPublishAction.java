package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPublishAction implements InterfaceC1891350zJl {

    @C09CT("bubble_struct")
    public final BulletinBubbleStruct bubbleStruct;

    @C09CT("event_tracking_fields")
    public final List<BulletinCardKV> extra;

    @C09CT("icon_uri")
    public final TuxImageModel iconUrlModel;

    @C09CT("post_type")
    public final int publishActionType;

    @C09CT("schema_url")
    public final String schema;

    @C09CT("text_model")
    public final InboxTextStruct text;

    public BulletinPublishAction() {
        this(-1, null, null, null, null, null);
    }

    public final BulletinPublishAction copy(int i, InboxTextStruct inboxTextStruct, TuxImageModel tuxImageModel, String str, List<BulletinCardKV> list, BulletinBubbleStruct bulletinBubbleStruct) {
        return new BulletinPublishAction(i, inboxTextStruct, tuxImageModel, str, list, bulletinBubbleStruct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinPublishAction)) {
            return false;
        }
        BulletinPublishAction bulletinPublishAction = (BulletinPublishAction) obj;
        return this.publishActionType == bulletinPublishAction.publishActionType && Intrinsics.LJFF(this.text, bulletinPublishAction.text) && Intrinsics.LJFF(this.iconUrlModel, bulletinPublishAction.iconUrlModel) && Intrinsics.LJFF(this.schema, bulletinPublishAction.schema) && Intrinsics.LJFF(this.extra, bulletinPublishAction.extra) && Intrinsics.LJFF(this.bubbleStruct, bulletinPublishAction.bubbleStruct);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        int i = this.publishActionType * 31;
        InboxTextStruct inboxTextStruct = this.text;
        int iHashCode = (i + (inboxTextStruct == null ? 0 : inboxTextStruct.hashCode())) * 31;
        TuxImageModel tuxImageModel = this.iconUrlModel;
        int iHashCode2 = (iHashCode + (tuxImageModel == null ? 0 : tuxImageModel.hashCode())) * 31;
        String str = this.schema;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<BulletinCardKV> list = this.extra;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        BulletinBubbleStruct bulletinBubbleStruct = this.bubbleStruct;
        return iHashCode4 + (bulletinBubbleStruct != null ? bulletinBubbleStruct.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPublishAction(publishActionType=");
        sbLIZ.append(this.publishActionType);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", iconUrlModel=");
        sbLIZ.append(this.iconUrlModel);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", bubbleStruct=");
        sbLIZ.append(this.bubbleStruct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final BulletinBubbleStruct getBubbleStruct() {
        return this.bubbleStruct;
    }

    public final List<BulletinCardKV> getExtra() {
        return this.extra;
    }

    public final TuxImageModel getIconUrlModel() {
        return this.iconUrlModel;
    }

    public final int getPublishActionType() {
        return this.publishActionType;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final InboxTextStruct getText() {
        return this.text;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof BulletinPublishAction) {
            BulletinPublishAction bulletinPublishAction = (BulletinPublishAction) interfaceC1891350zJl;
            if (Intrinsics.LJFF(this.text, bulletinPublishAction.text) && Intrinsics.LJFF(this.iconUrlModel, bulletinPublishAction.iconUrlModel) && Intrinsics.LJFF(this.schema, bulletinPublishAction.schema)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof BulletinPublishAction) && this.publishActionType == ((BulletinPublishAction) interfaceC1891350zJl).publishActionType) {
            return true;
        }
        return false;
    }

    public BulletinPublishAction(int i, InboxTextStruct inboxTextStruct, TuxImageModel tuxImageModel, String str, List<BulletinCardKV> list, BulletinBubbleStruct bulletinBubbleStruct) {
        this.publishActionType = i;
        this.text = inboxTextStruct;
        this.iconUrlModel = tuxImageModel;
        this.schema = str;
        this.extra = list;
        this.bubbleStruct = bulletinBubbleStruct;
    }
}
