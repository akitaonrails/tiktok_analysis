package com.ss.android.ugc.aweme.emojisticker.common.viewerlist.component;

import X.C0S1B;
import X.C1243240iSQ;
import X.C1387050mCN;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1608750rxx;
import X.C384050F3z;
import X.C418440Gaw;
import X.C730150SkX;
import X.C737730Swl;
import X.C737740Swm;
import X.C737760Swo;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1387060mCO;
import X.EnumC1606080rte;
import X.EnumC1607270rvZ;
import X.InterfaceC1891350zJl;
import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.widget.SeekBar;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class EmojiSliderStickerReactionCell extends PowerCell<C737730Swl> {
    public AvatarComponentView LL;
    public TuxTextView LLILLJJLI;
    public SeekBar LLILLL;
    public RelationButton LLILZ;
    public boolean LLILZIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c46;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.itemView.findViewById(R.id.h0g);
        C1608750rxx config = avatarComponentView.getConfig();
        new AwS590S0100000_11(this, 65).invoke(config.LIZ);
        config.LIZLLL(new C737760Swo(new C1606750ruj(EnumC1606080rte.STORY_VIEWS_LIST_PANEL, new C1606770rul(null, null, null, null, null, new AwS555S0100000_11(this, 155), null, null, null, 479), 4)), new C737740Swm(0));
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        this.LL = avatarComponentView;
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.zju);
        SeekBar seekBar = (SeekBar) this.itemView.findViewById(R.id.u0d);
        if (seekBar != null) {
            Context context = seekBar.getContext();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z.LJFF = Integer.valueOf(R.attr.c5);
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z.LIZJ = Float.valueOf(context.getResources().getDimension(R.dimen.b4));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
            seekBar.setThumb(c384050F3z.LIZ(context));
        } else {
            seekBar = null;
        }
        this.LLILLL = seekBar;
        this.LLILZ = (RelationButton) this.itemView.findViewById(R.id.h0h);
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 6), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        User user;
        Aweme aweme;
        int iIntValue;
        String strLIZ;
        String uid;
        C737730Swl c737730Swl = (C737730Swl) interfaceC1891350zJl;
        super.onBindItemView(c737730Swl);
        this.LLILZIL = false;
        User user2 = c737730Swl.LL;
        AvatarComponentView avatarComponentView = this.LL;
        if (avatarComponentView != null) {
            if (user2 == null || (uid = user2.getUid()) == null) {
                uid = "";
            }
            C0S1B.LIZ(avatarComponentView, uid, user2, this, false, null, 56);
            avatarComponentView.LJIILIIL(c737730Swl, EnumC1607270rvZ.INTERACTION);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            if (user2 != null) {
                C1243240iSQ.LIZ.getClass();
                strLIZ = C1243240iSQ.LIZ(user2, true);
            } else {
                strLIZ = null;
            }
            tuxTextView.setText(strLIZ);
        }
        SeekBar seekBar = this.LLILLL;
        if (seekBar != null) {
            Integer num = c737730Swl.LLILLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            seekBar.setProgress(iIntValue);
        }
        SeekBar seekBar2 = this.LLILLL;
        if (seekBar2 != null) {
            seekBar2.setEnabled(false);
        }
        RelationButton relationButton = this.LLILZ;
        if (relationButton != null && (user = c737730Swl.LL) != null && (aweme = c737730Swl.LLILLJJLI) != null) {
            C1387050mCN c1387050mCN = new C1387050mCN(user);
            c1387050mCN.LIZIZ = true;
            c1387050mCN.LJIIJJI = this;
            c1387050mCN.LJ = EnumC1387060mCO.MESSAGE;
            C730150SkX.LIZLLL(c1387050mCN, this.itemView.getContext(), null, null);
            relationButton.LLLLZIL(c1387050mCN.LIZ());
            relationButton.setTracker(new AwS255S0300000_11(c737730Swl, aweme, user, 11));
        }
    }
}
