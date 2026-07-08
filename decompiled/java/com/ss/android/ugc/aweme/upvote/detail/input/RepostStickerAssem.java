package com.ss.android.ugc.aweme.upvote.detail.input;

import X.AbstractC1360390lVN;
import X.C019F;
import X.C01GW;
import X.C04TD;
import X.C08CX;
import X.C0HKZ;
import X.C0HYP;
import X.C1359510lTx;
import X.C1360200lV4;
import X.C1360350lVJ;
import X.C1360380lVM;
import X.C1360400lVO;
import X.C1360420lVQ;
import X.C1360440lVS;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C339190DRl;
import X.C426020GnA;
import X.C427870Gq9;
import X.C452501pT;
import X.C453740Hqm;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451150Hmb;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.feed.model.im.IMAIMojiSticker;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.im.sticker.api.model.AiMojiModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.socialavatar.sticker.SocialAvatarStickerServiceImpl;
import com.ss.android.ugc.ur.socialavatar.repost.SocialAvatarRepostSettings;
import com.ss.android.ugc.ur.socialavatar.sticker.ISocialAvatarStickerService;
import com.ss.android.ugc.ur.socialavatar.sticker.SocialAvatarStickerBannerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostStickerAssem extends UIContentAssem implements IRepostStickerAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public FrameLayout LLIZLLLIL;
    public C427870Gq9 LLJ;
    public C426020GnA LLJI;
    public FrameLayout LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C1559260qg8 LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostStickerAssem.class, "stickerBannerVM", "getStickerBannerVM()Lcom/ss/android/ugc/ur/socialavatar/sticker/SocialAvatarStickerBannerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RepostStickerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialAvatarStickerBannerViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 853), AFwS259S0000000_21.get$arr$(232), null, true);
        this.LLJILJILJ = new C1559260qg8(new C723590SZx(this, C1360200lV4.class, null), checkSupervisorPrepared());
        this.LLJILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(342));
        this.LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 851));
        this.LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 850));
        this.LLJJIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 852));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C1360200lV4 Go() {
        return (C1360200lV4) this.LLJILJILJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.input.IRepostStickerAbility
    public final void HA2() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        assemVMLazy.getValue().setState(new AwS600S0100000_21(C1360420lVQ.LIZ, 428));
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.input.IRepostStickerAbility
    public final void Om1() {
        ObjectAnimator objectAnimator;
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout == null || frameLayout.getVisibility() != 0 || (objectAnimator = (ObjectAnimator) this.LLJJIII.getValue()) == null) {
            return;
        }
        C786410Ut5.Pd(objectAnimator);
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.input.IRepostStickerAbility
    public final Pair<C453740Hqm, Integer> Th1() {
        C1360350lVJ c1360350lVJ;
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        AbstractC1360390lVN abstractC1360390lVN = ((C1360380lVM) assemVMLazy.getValue().getState()).LL;
        if (!(abstractC1360390lVN instanceof C1360350lVJ) || (c1360350lVJ = (C1360350lVJ) abstractC1360390lVN) == null) {
            return null;
        }
        InterfaceC451150Hmb interfaceC451150Hmb = c1360350lVJ.LIZ;
        if (!(interfaceC451150Hmb instanceof C453740Hqm) || interfaceC451150Hmb == null) {
            return null;
        }
        return new Pair<>(interfaceC451150Hmb, Integer.valueOf(c1360350lVJ.LIZIZ));
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.input.IRepostStickerAbility
    public final void r01() {
        ObjectAnimator objectAnimator;
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout == null || frameLayout.getVisibility() != 8 || (objectAnimator = (ObjectAnimator) this.LLJJI.getValue()) == null) {
            return;
        }
        C786410Ut5.Pd(objectAnimator);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        IMAIMojiSticker iMAIMojiSticker;
        super.onDestroy();
        Pair<C453740Hqm, Integer> pairTh1 = Th1();
        if (pairTh1 == null) {
            return;
        }
        C453740Hqm first = pairTh1.getFirst();
        String str = Go().LLILZIL;
        if (str == null) {
            str = Go().LLILLL;
        }
        UpvoteStruct upvoteStruct = (UpvoteStruct) this.LLJJ.getValue();
        if (upvoteStruct != null && (iMAIMojiSticker = upvoteStruct.aiMojiSticker) != null) {
            long j = first.LL;
            Long l = iMAIMojiSticker.id;
            if (l != null && j == l.longValue()) {
                if (str != null) {
                    C1359510lTx.LIZ.remove(str);
                    return;
                }
                return;
            }
        }
        if (str != null) {
            C1359510lTx.LIZ.put(str, first);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IRepostStickerAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ISocialAvatarStickerService iSocialAvatarStickerService;
        C1360400lVO c1360400lVO;
        IMAIMojiSticker iMAIMojiSticker;
        long jLongValue;
        long jLongValue2;
        UrlModel urlModel;
        UrlModel urlModel2;
        UrlModel urlModel3;
        String str;
        int iIntValue;
        super.onViewCreated(view);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.tap);
        this.LLJ = (C427870Gq9) view.findViewById(R.id.t_c);
        this.LLJI = (C426020GnA) view.findViewById(R.id.t_d);
        this.LLJIJIL = (FrameLayout) view.findViewById(R.id.tar);
        FrameLayout frameLayout = this.LLJIJIL;
        if (frameLayout != null) {
            C786410Ut5.fd(frameLayout, C339190DRl.LIZ(-40));
        }
        C0HYP.LIZ.getClass();
        boolean z = !C0HYP.LJ().getBoolean("repost_sticker_banner_guidance_shown", false);
        Object objLIZ = C04TD.LIZ(ISocialAvatarStickerService.class, false);
        if (objLIZ != null) {
            iSocialAvatarStickerService = (ISocialAvatarStickerService) objLIZ;
        } else {
            if (C04TD.N6 == null) {
                synchronized (ISocialAvatarStickerService.class) {
                    if (C04TD.N6 == null) {
                        C04TD.N6 = new SocialAvatarStickerServiceImpl();
                    }
                }
            }
            iSocialAvatarStickerService = C04TD.N6;
        }
        String str2 = Go().LL;
        String str3 = Go().LLILLJJLI;
        List<String> list = SocialAvatarRepostSettings.LIZ().defaultExpressions;
        C453740Hqm c453740Hqm = Go().LLILZ;
        if (c453740Hqm != null) {
            c1360400lVO = new C1360400lVO(c453740Hqm, C0HKZ.CACHE);
        } else {
            UpvoteStruct upvoteStruct = (UpvoteStruct) this.LLJJ.getValue();
            if (upvoteStruct != null && (iMAIMojiSticker = upvoteStruct.aiMojiSticker) != null) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(((User) this.LLJILLL.getValue()).getUid());
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = -1;
                }
                Long l = iMAIMojiSticker.setId;
                long jLongValue3 = 0;
                if (l != null) {
                    jLongValue2 = l.longValue();
                } else {
                    jLongValue2 = 0;
                }
                Long l2 = iMAIMojiSticker.id;
                if (l2 != null) {
                    jLongValue3 = l2.longValue();
                }
                Set set = iMAIMojiSticker.expressions;
                if (set == null) {
                    set = C08CX.INSTANCE;
                }
                StickerUrlStruct stickerUrlStruct = iMAIMojiSticker.stickerUrl;
                if (stickerUrlStruct != null) {
                    urlModel = stickerUrlStruct.lowResolutionUrl;
                    urlModel2 = stickerUrlStruct.midResolutionUrl;
                    urlModel3 = stickerUrlStruct.highResolutionUrl;
                    str = stickerUrlStruct.uri;
                } else {
                    urlModel = null;
                    urlModel2 = null;
                    urlModel3 = null;
                    str = null;
                }
                AiMojiModel aiMojiModel = new AiMojiModel(urlModel, urlModel2, urlModel3, str);
                Integer num = iMAIMojiSticker.aiMojiType;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c1360400lVO = new C1360400lVO(new C453740Hqm(jLongValue3, jLongValue, jLongValue2, aiMojiModel, set, iIntValue), C0HKZ.CURRENT_REPOST);
            } else {
                c1360400lVO = null;
            }
        }
        iSocialAvatarStickerService.LIZ(this, new C1360440lVS(str2, str3, 10, list, z, c1360400lVO, AFwS209S0000000_21.get$arr$(343)));
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0lVK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1360380lVM) obj).LL;
            }
        }, null, new AwS635S0100000_21(this, 90), 6);
    }
}
