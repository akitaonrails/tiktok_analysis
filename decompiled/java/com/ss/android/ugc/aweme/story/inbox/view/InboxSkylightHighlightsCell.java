package com.ss.android.ugc.aweme.story.inbox.view;

import X.C01GW;
import X.C03IT;
import X.C0GUV;
import X.C1243240iSQ;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1387040mCM;
import X.C13LP;
import X.C1595350rcL;
import X.C1605450rsd;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C1608750rxx;
import X.C1618440sDa;
import X.C2097608Jq;
import X.C295190Bhd;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427660Gpo;
import X.C452501pT;
import X.C614770O9j;
import X.C737760Swo;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1605560rso;
import X.EnumC1606080rte;
import X.InterfaceC1398730mVD;
import X.InterfaceC1398760mVG;
import X.InterfaceC1595080rbu;
import X.InterfaceC1605460rse;
import X.InterfaceC1891350zJl;
import X.ViewOnLongClickListenerC1620730sHH;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell;
import com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS127S1000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxSkylightHighlightsCell extends LongClickAbilitySkylightCell<SkylightHighlightsItem> {
    public InterfaceC1398730mVD LLILZIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1183));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(358));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(357));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1180));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1182));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1181));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1185));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1184));
    public final C1605450rsd LLJIJIL = new InterfaceC1605460rse() { // from class: X.0rsd
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC1605460rse
        public final void LIZ(String str) {
            InterfaceC1398760mVG interfaceC1398760mVG;
            Aweme highlightCollection;
            UserStory userStory;
            Aweme highlightCollection2;
            User author;
            SkylightHighlightsItem skylightHighlightsItem = (SkylightHighlightsItem) this.LIZ.getItem();
            String uid = null;
            if (skylightHighlightsItem != null && (highlightCollection2 = skylightHighlightsItem.getHighlightCollection()) != null && (author = highlightCollection2.getAuthor()) != null) {
                uid = author.getUid();
            }
            if (Intrinsics.LJFF(uid, str)) {
                SkylightHighlightsItem skylightHighlightsItem2 = (SkylightHighlightsItem) this.LIZ.getItem();
                if (skylightHighlightsItem2 != null && (highlightCollection = skylightHighlightsItem2.getHighlightCollection()) != null && (userStory = highlightCollection.getUserStory()) != null) {
                    userStory.setAllViewed(true);
                }
                InterfaceC1398730mVD interfaceC1398730mVD = this.LIZ.LLILZIL;
                if ((interfaceC1398730mVD instanceof InterfaceC1398760mVG) && (interfaceC1398760mVG = (InterfaceC1398760mVG) interfaceC1398730mVD) != null) {
                    interfaceC1398760mVG.LJIILLIIL(2, "", "");
                }
                this.LIZ.W5(true);
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final Map<String, String> P5() {
        return C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("head_type", "story"));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fbt;
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View L5() {
        return (View) this.LLJ.getValue();
    }

    public final AvatarComponentView T5() {
        return (AvatarComponentView) this.LLILZLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        EnumC1606080rte enumC1606080rte = EnumC1606080rte.INBOX_TOP_LIST;
        c1607400rvm.LIZIZ(enumC1606080rte, new C1608320rxG(this.itemView, T5(), (View) null, (View) this.LLJ.getValue(), (TuxIconView) null, 48), C295190Bhd.LIZIZ());
        C737760Swo c737760Swo = new C737760Swo(new C1606750ruj(enumC1606080rte, new C1606770rul(null, new AwS638S0100000_24(this, 198), AFwS264S0000000_24.get$arr$(732), new AwS638S0100000_24(this, 200), null, null, new AwS603S0100000_24(this, 657), null, null, 433), 4));
        AvatarComponentView avatarComponentViewT5 = T5();
        C1608750rxx config = avatarComponentViewT5.getConfig();
        new AwS603S0100000_24(this, 659).invoke(config.LIZ);
        config.LIZJ(c737760Swo);
        config.LIZIZ(AFwS264S0000000_24.get$arr$(734));
        avatarComponentViewT5.LJFF(avatarComponentViewT5.getConfig());
        this.itemView.setTag(R.id.kah, T5());
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 117), this.itemView);
        if (Y()) {
            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1851);
            T5().LIZ(3, new ACListenerS158S0100000_24(awS568S0100000_24, 119));
            this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1620730sHH(awS568S0100000_24, 4));
        }
        T5().getClickListener().setOnNodeClickListener(new AwS638S0100000_24(this, 202));
        C1595350rcL.LIZLLL(this);
        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) this.LLILZ.getValue();
        if (iSocPubStatusRepoService != null) {
            iSocPubStatusRepoService.LJIIIIZZ(this.LLJIJIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final User N5() {
        Aweme highlightCollection;
        SkylightHighlightsItem skylightHighlightsItem = (SkylightHighlightsItem) getItem();
        if (skylightHighlightsItem == null || (highlightCollection = skylightHighlightsItem.getHighlightCollection()) == null) {
            return null;
        }
        return highlightCollection.getAuthor();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final View R5() {
        return T5();
    }

    @Override // com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell
    public final EnumC1605560rso I5() {
        return EnumC1605560rso.MUTE_STORIES;
    }

    public final void U5(SkylightHighlightsItem skylightHighlightsItem) {
        boolean zLJFF;
        int i;
        InterfaceC1398730mVD interfaceC1398730mVD;
        InterfaceC1398760mVG interfaceC1398760mVG;
        User author = skylightHighlightsItem.getHighlightCollection().getAuthor();
        String strLIZ = null;
        if (author != null) {
            C1243240iSQ.LIZ.getClass();
            strLIZ = C1243240iSQ.LIZ(author, true);
        }
        ((TextView) this.LLJ.getValue()).setText(strLIZ);
        C1387040mCM.LIZ(this.itemView, new AwS127S1000000_24(strLIZ, 2));
        UrlModel avatar300 = author.getAvatar300();
        C427660Gpo avatar = T5().getAvatar();
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(avatar300.getUrlList()));
        c1331670kl3LJIIJ.LJJIIZ(R.drawable.bh6);
        avatar.LIZ(c1331670kl3LJIIJ.LIZJ());
        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) this.LLILZ.getValue();
        if (iSocPubStatusRepoService != null) {
            zLJFF = Intrinsics.LJFF(iSocPubStatusRepoService.LJIILL(author.getUid()), Boolean.TRUE);
            if (zLJFF) {
                i = 2;
            }
            interfaceC1398730mVD = this.LLILZIL;
            if ((interfaceC1398730mVD instanceof InterfaceC1398760mVG) && (interfaceC1398760mVG = (InterfaceC1398760mVG) interfaceC1398730mVD) != null) {
                interfaceC1398760mVG.LJIILLIIL(i, "", "");
            }
            W5(zLJFF);
        }
        zLJFF = false;
        i = 1;
        interfaceC1398730mVD = this.LLILZIL;
        if (interfaceC1398730mVD instanceof InterfaceC1398760mVG) {
            interfaceC1398760mVG.LJIILLIIL(i, "", "");
        }
        W5(zLJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V5(boolean z) {
        String str;
        String uid;
        Aweme highlightCollection;
        User author;
        int iLIZ = C1595350rcL.LIZ(this);
        if (z) {
            str = "plus";
        } else {
            str = "head";
        }
        InterfaceC1595080rbu interfaceC1595080rbuLIZJ = C614770O9j.LIZIZ.LIZJ();
        int i = iLIZ - 1;
        SkylightHighlightsItem skylightHighlightsItem = (SkylightHighlightsItem) getItem();
        if (skylightHighlightsItem == null || (highlightCollection = skylightHighlightsItem.getHighlightCollection()) == null || (author = highlightCollection.getAuthor()) == null || (uid = author.getUid()) == null) {
            uid = "";
        }
        interfaceC1595080rbuLIZJ.LJI(i, "notification_page", null, "story_highlight", str, uid, null);
    }

    public final void W5(boolean z) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Drawable gradientDrawable;
        Context context = this.itemView.getContext();
        C0GUV c0guv = (C0GUV) this.LLIZ.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
        c0guv.setCoverDrawable(c384050F3z.LIZ(context));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.as4, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.as5, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.as6, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZ = R.raw.icon_star_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        if (z) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a01);
            gradientDrawable = c384050F3z2.LIZ(context);
        } else {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{iIntValue, iIntValue2, iIntValue3});
        }
        ((C0GUV) this.LLIZLLLIL.getValue()).setCoverDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, gradientDrawable));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1618440sDa.LIZIZ.LJJ().LIZLLL(viewGroup.getContext(), null, R.layout.fbt, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        SkylightHighlightsItem skylightHighlightsItem = (SkylightHighlightsItem) interfaceC1891350zJl;
        super.onBindItemView(skylightHighlightsItem, list);
        if (list.isEmpty()) {
            U5(skylightHighlightsItem);
        } else {
            C13LP.LJJJLZIJ(0, list);
            U5(skylightHighlightsItem);
        }
    }
}
