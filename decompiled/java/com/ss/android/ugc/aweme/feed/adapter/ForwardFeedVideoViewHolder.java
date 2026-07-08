package com.ss.android.ugc.aweme.feed.adapter;

import X.C086I;
import X.C0RF0;
import X.C0RZF;
import X.C729980SkG;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.RelationLabelHelper;

/* JADX INFO: loaded from: classes12.dex */
public class ForwardFeedVideoViewHolder extends VideoViewCell {
    public final C0RZF T0;
    public Aweme U0;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final Aweme hm() {
        Aweme aweme = this.U0;
        return aweme == null ? getAweme() : aweme;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLLLLLL() {
        super.LLLLLLL();
        C0RZF c0rzf = this.T0;
        Aweme aweme = c0rzf.LIZ;
        if (aweme != null) {
            if (((aweme.getRelationLabel() == null || c0rzf.LIZ.getRelationLabel().getType() != 1 || TextUtils.isEmpty(c0rzf.LIZ.getRelationLabel().getLabelInfo())) && (c0rzf.LIZ.getFeedRelationLabel() == null || c0rzf.LIZ.getFeedRelationLabel().getType().intValue() != 3 || C086I.LIZIZ(c0rzf.LIZ.getFeedRelationLabel().getUserList()))) || RelationLabelHelper.hasNewRelationLabel(c0rzf.LIZ.getForwardItem()) || !RelationLabelHelper.hasNewRelationLabel(c0rzf.LIZ)) {
                return;
            }
            AwemeBizExtKt.setNewRelationLabel(c0rzf.LIZ.getForwardItem(), AwemeBizExtKt.getNewRelationLabel(c0rzf.LIZ));
        }
    }

    public ForwardFeedVideoViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
        this.T0 = new C0RZF();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public void LJI(Aweme aweme) {
        this.U0 = aweme;
        this.T0.LIZ = aweme;
        super.LJI(C729980SkG.LIZLLL(aweme));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
        super.LLLLIL(C729980SkG.LIZLLL(aweme));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final Aweme f(int i) {
        if (i == 7) {
            return hm();
        }
        return super.f(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void L0(int i, Aweme aweme) {
        this.U0 = aweme;
        this.T0.LIZ = aweme;
        super.L0(i, C729980SkG.LIZLLL(aweme));
    }
}
