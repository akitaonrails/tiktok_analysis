package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ActionButton_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton> {
    public static int LIZJ(PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton) {
        return C1142340fpg.LJIIIZ(1, actionButton.buttonType) + _Text_ProtoEncoder.LJ(2, actionButton.buttonActiveText) + _Text_ProtoEncoder.LJ(3, actionButton.buttonInactiveText) + C1142340fpg.LJIILL(4, actionButton.buttonSchema) + C1142340fpg.LJI(5);
    }

    public static void LIZIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton) {
        int i = actionButton.buttonType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 2, actionButton.buttonActiveText);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 3, actionButton.buttonInactiveText);
        C1142340fpg.LJFF(c1142350fph, 4, actionButton.buttonSchema);
        boolean z = actionButton.enableButtonInactiveText;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJ(z ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton) {
        LIZIZ(c1142350fph, actionButton);
    }
}
