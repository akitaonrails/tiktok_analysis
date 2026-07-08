package com.ss.android.ugc.aweme.service;

import X.C0C64;
import X.C0ZIU;
import X.C11NZ;
import X.C1220040hr0;
import X.C1220270hrN;
import X.C1220830hsH;
import X.C12823050b;
import X.C13IQ;
import X.C13LE;
import X.C1442910neT;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C345800Dh4;
import X.C452070Ho5;
import X.C5182020e;
import X.C724750Sbp;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.api.IMentionVideoApi;
import com.ss.android.ugc.aweme.compose.MentionFavoriteComposeFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.fragments.MentionVideoListFragment;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.viewmodel.BaseVideoListVM;
import com.ss.android.ugc.aweme.viewmodel.MentionVideoShareModel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MentionVideoService implements IMentionVideoApi {
    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIIJ() {
        C0ZIU.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "video_credits_page");
        c2344009Gk.LJIIIIZZ("creation_id", C0ZIU.LIZIZ);
        C20684815ws.LJIILLIIL("confirm_credit", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LIZJ() {
        if (!(C0C64.LJIILLIIL().LJIJ(31744, 0, "mention_video_compose_experiment", true) != 0)) {
            return LJIIIZ(10);
        }
        MentionFavoriteComposeFragment.LLJJJJLIIL.getClass();
        MentionFavoriteComposeFragment mentionFavoriteComposeFragment = new MentionFavoriteComposeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("page_type", 10);
        mentionFavoriteComposeFragment.setArguments(bundle);
        return mentionFavoriteComposeFragment;
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LIZ(int i) {
        C0ZIU.LIZ.getClass();
        if (!C0ZIU.LIZIZ(i) && i != 6) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LIZLLL(TextExtraStruct textExtraStruct) {
        C0ZIU.LIZ.getClass();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LJ(TextExtraStruct textExtraStruct) {
        C0ZIU.LIZ.getClass();
        if (textExtraStruct.getType() != 5) {
            return false;
        }
        int subtype = textExtraStruct.getSubtype();
        if ((!C0ZIU.LIZIZ(subtype) && subtype != 6) || TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final List<Aweme> LJI(String str) {
        C11NZ c11nzLIZ = C1220830hsH.LIZ(str);
        c11nzLIZ.getClass();
        C345800Dh4 c345800Dh4 = new C345800Dh4();
        c11nzLIZ.LIZIZ(c345800Dh4);
        T tLIZ = c345800Dh4.LIZ();
        if (tLIZ != 0) {
            return ((FeedItemList) tLIZ).getItems();
        }
        throw new NoSuchElementException();
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJII(String str) {
        C0ZIU.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "video_post_page");
        c2344009Gk.LJIIIIZZ("creation_id", C0ZIU.LIZIZ);
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("credit_item_category", C0ZIU.LIZJ);
        C20684815ws.LJIILLIIL("show_credits_item_preview", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LJIIIIZZ(int i) {
        C0ZIU.LIZ.getClass();
        if (!C0ZIU.LIZIZ(i) && i != 6) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LJIIIZ(int i) {
        MentionVideoListFragment.LLJJIJI.getClass();
        return C1220040hr0.LIZ(i, null, null);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final String LJIIL(int i) {
        C0ZIU.LIZ.getClass();
        switch (i) {
            case 6:
                return "posted";
            case 7:
            case BdTuring.TYPE_EMAIL /* 11 */:
            default:
                return "getItemCategoryError";
            case 8:
                return "sound";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "liked";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "favorites";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "paste_short";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "paste_long";
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIILIIL(Fragment fragment) {
        MentionVideoListFragment mentionVideoListFragment;
        BaseVideoListVM<C1220270hrN, C12823050b, Long> baseVideoListVM;
        C0ZIU.LIZ.getClass();
        if ((fragment instanceof MentionVideoListFragment) && (mentionVideoListFragment = (MentionVideoListFragment) fragment) != null && (baseVideoListVM = mentionVideoListFragment.LLJJ) != null && mentionVideoListFragment.LLJILLL && baseVideoListVM.LLILZLL) {
            mentionVideoListFragment.LLJILLL = false;
            baseVideoListVM.manualListRefresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void setCreationId(String str) {
        C0ZIU.LIZ.getClass();
        C0ZIU.LIZIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LIZIZ(C19EG c19eg, C1442910neT c1442910neT) {
        C0ZIU.LIZ.getClass();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MentionVideoShareModel.class);
        MentionVideoShareModel mentionVideoShareModel = (MentionVideoShareModel) new AssemVMLazy(C724750Sbp.LJIIJ(c19eg, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 433), new C452070Ho5(), C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) c19eg, 3149), AFwS257S0000000_19.get$arr$(737)).getValue();
        mentionVideoShareModel.vQ2(new C2217381BqS() { // from class: X.0hs7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1220740hs8) obj).LL;
            }
        }, new AwS598S0100000_19(c1442910neT, 796));
        mentionVideoShareModel.vQ2(new C2217381BqS() { // from class: X.0hs9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1220740hs8) obj).LLILLL;
            }
        }, new AwS598S0100000_19(c1442910neT, 797));
        mentionVideoShareModel.vQ2(new C2217381BqS() { // from class: X.0hsA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1220740hs8) obj).LLILLJJLI;
            }
        }, new AwS598S0100000_19(c1442910neT, 798));
        mentionVideoShareModel.vQ2(new C2217381BqS() { // from class: X.0hsB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1220740hs8) obj).LLILZ;
            }
        }, new AwS598S0100000_19(c1442910neT, 799));
        mentionVideoShareModel.vQ2(new C2217381BqS() { // from class: X.0hsC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1220740hs8) obj).LLILZIL;
            }
        }, new AwS598S0100000_19(c1442910neT, 795));
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJFF(Activity activity, String str) {
        C0ZIU c0ziu = C0ZIU.LIZ;
        boolean z = !Intrinsics.LJFF("click_preview", "click_panel");
        c0ziu.getClass();
        C0ZIU.LIZ(activity, str, "click_preview", z);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LJIIJJI(String str, String str2) {
        MentionVideoListFragment.LLJJIJI.getClass();
        return C1220040hr0.LIZ(8, str, str2);
    }
}
