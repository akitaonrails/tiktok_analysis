package com.ss.android.ugc.aweme.emojisticker.common.viewerlist.component;

import X.C1606750ruj;
import X.C1606770rul;
import X.C1608750rxx;
import X.C737720Swk;
import X.C737740Swm;
import X.C737760Swo;
import X.C786410Ut5;
import X.EnumC1606080rte;
import Y.ACListenerS146S0100000_11;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractiveEmojiStickerReactionCell extends PowerCell<C737720Swk> {
    public AvatarComponentView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public RelationButton LLILZ;
    public boolean LLILZIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ctu;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.itemView.findViewById(R.id.bkz);
        if (avatarComponentView != null) {
            C1608750rxx config = avatarComponentView.getConfig();
            new AwS590S0100000_11(this, 66).invoke(config.LIZ);
            config.LIZLLL(new C737740Swm(0), new C737760Swo(new C1606750ruj(EnumC1606080rte.STORY_VIEWS_LIST_PANEL, new C1606770rul(null, null, null, null, null, new AwS555S0100000_11(this, 156), null, null, null, 479), 4)));
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        } else {
            avatarComponentView = null;
        }
        this.LL = avatarComponentView;
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.p0w);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.foa);
        this.LLILZ = (RelationButton) this.itemView.findViewById(R.id.t4l);
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 7), this.itemView);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r12) {
        /*
            r11 = this;
            X.0Swk r12 = (X.C737720Swk) r12
            r7 = r11
            super.onBindItemView(r12)
            com.ss.android.ugc.aweme.profile.model.User r6 = r12.LL
            com.ss.android.ugc.aweme.avatar.AvatarComponentView r4 = r7.LL
            if (r4 == 0) goto L22
            if (r6 == 0) goto L14
            java.lang.String r5 = r6.getUid()
            if (r5 != 0) goto L16
        L14:
            java.lang.String r5 = ""
        L16:
            r8 = 0
            r9 = 0
            r10 = 56
            X.C0S1B.LIZ(r4, r5, r6, r7, r8, r9, r10)
            X.0rvZ r0 = X.EnumC1607270rvZ.INTERACTION
            r4.LJIILIIL(r12, r0)
        L22:
            com.bytedance.tux.input.TuxTextView r1 = r7.LLILLJJLI
            r5 = 0
            if (r1 == 0) goto L36
            if (r6 == 0) goto L99
            X.0iSQ r0 = X.C1243240iSQ.LIZ
            r0.getClass()
            r0 = 1
            java.lang.String r0 = X.C1243240iSQ.LIZ(r6, r0)
        L33:
            r1.setText(r0)
        L36:
            com.bytedance.tux.input.TuxTextView r2 = r7.LLILLL
            r6 = 1
            if (r2 == 0) goto L55
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.LLILLJJLI
            if (r0 == 0) goto L89
            boolean r0 = r0.getIsTikTokStory()
            if (r0 != r6) goto L89
            android.content.Context r1 = r7.getContext()
            if (r1 == 0) goto L97
            r0 = 2131822152(0x7f110648, float:1.9277067E38)
            java.lang.String r0 = r1.getString(r0)
        L52:
            r2.setText(r0)
        L55:
            com.ss.android.ugc.aweme.relation.follow.ui.RelationButton r4 = r7.LLILZ
            if (r4 == 0) goto L88
            com.ss.android.ugc.aweme.profile.model.User r3 = r12.LL
            if (r3 == 0) goto L88
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r12.LLILLJJLI
            if (r2 == 0) goto L88
            X.0mCN r1 = new X.0mCN
            r1.<init>(r3)
            r1.LIZIZ = r6
            r1.LJIIJJI = r7
            X.0mCO r0 = X.EnumC1387060mCO.MESSAGE
            r1.LJ = r0
            android.view.View r0 = r7.itemView
            android.content.Context r0 = r0.getContext()
            X.C730150SkX.LIZLLL(r1, r0, r5, r5)
            X.0zlx r0 = r1.LIZ()
            r4.LLLLZIL(r0)
            kotlin.jvm.internal.AwS255S0300000_11 r1 = new kotlin.jvm.internal.AwS255S0300000_11
            r0 = 12
            r1.<init>(r12, r2, r3, r0)
            r4.setTracker(r1)
        L88:
            return
        L89:
            android.content.Context r1 = r7.getContext()
            if (r1 == 0) goto L97
            r0 = 2131830732(0x7f1127cc, float:1.929447E38)
            java.lang.String r0 = r1.getString(r0)
            goto L52
        L97:
            r0 = r5
            goto L52
        L99:
            r0 = r5
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emojisticker.common.viewerlist.component.InteractiveEmojiStickerReactionCell.onBindItemView(X.0zJl):void");
    }
}
