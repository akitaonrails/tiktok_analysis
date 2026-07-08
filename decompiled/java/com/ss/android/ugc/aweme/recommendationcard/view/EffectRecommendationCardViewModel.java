package com.ss.android.ugc.aweme.recommendationcard.view;

import X.C01GW;
import X.C09IC;
import X.C09IR;
import X.C0T2Y;
import X.C12AI;
import X.C12AJ;
import X.C12AL;
import X.C12AW;
import X.C1479530obX;
import X.C1569440qwY;
import X.C1697810uHb;
import X.C197101129r;
import X.C19EG;
import X.C2084808Es;
import X.C2252331DDr;
import X.C23250099c;
import X.C452501pT;
import X.C486860J7k;
import X.C861640Xr8;
import X.InterfaceC1483670oiD;
import android.content.ComponentCallbacks;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.data.EffectStructV2;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectRecommendationCardViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(99));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(123));
    public ScrollSwitchStateManager LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final C2252331DDr LLILZLL;
    public final MutableLiveData<C12AJ> LLIZ;
    public final MutableLiveData LLIZLLLIL;

    public final InterfaceC1483670oiD wQ2() {
        return (InterfaceC1483670oiD) this.LL.getValue();
    }

    public final void xQ2() {
        C12AJ value;
        C12AJ value2;
        if (!this.LLILZ || this.LLILZIL || (value = this.LLIZ.getValue()) == null || value.LJFF == null || (value2 = this.LLIZ.getValue()) == null) {
            return;
        }
        List<CardContent> list = value2.LIZJ;
        if (list != null) {
            int i = 0;
            for (CardContent cardContent : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                CardContent cardContent2 = cardContent;
                String str = value2.LJFF;
                String strLIZ = str != null ? C2084808Es.LIZ(str) : null;
                Integer numValueOf = Integer.valueOf(i2);
                String str2 = value2.LJ;
                EffectStructV2 effectStructV2 = cardContent2.effect;
                C197101129r.LIZ(str2, numValueOf, effectStructV2 != null ? effectStructV2.effectId : null, "prop_three_card", strLIZ, null);
                i = i2;
            }
        }
        Object value3 = this.LLILLJJLI.getValue();
        String str3 = value2.LJFF;
        value3.getClass();
        C12AW.LIZLLL(str3);
        this.LLILZIL = true;
    }

    public final void yQ2() {
        String str;
        C12AJ value = this.LLIZ.getValue();
        String str2 = value != null ? value.LJ : null;
        C12AJ value2 = this.LLIZ.getValue();
        if (value2 == null || (str = value2.LIZLLL) == null || !this.LLILZ || wQ2().getPlayState().isPlaying() || wQ2().getPlayState().isLoading()) {
            return;
        }
        List<String> listSingletonList = Collections.singletonList(str);
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setUrlKey(str2);
        videoUrlModel.setSourceId(str2);
        videoUrlModel.setUrlList(listSingletonList);
        simVideoUrlModel.origin = videoUrlModel;
        simVideoUrlModel.setUrlKey(str2);
        simVideoUrlModel.setSourceId(str2);
        simVideoUrlModel.setUrlList(listSingletonList);
        C1479530obX c1479530obX = new C1479530obX();
        c1479530obX.LJII = simVideoUrlModel;
        c1479530obX.LJJJLL = false;
        c1479530obX.LJIILLIIL = true;
        c1479530obX.LJIL = false;
        wQ2().LJJJJJL(c1479530obX);
    }

    public EffectRecommendationCardViewModel() {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILZLL = c2252331DDrLIZIZ;
        MutableLiveData<C12AJ> mutableLiveData = new MutableLiveData<>(new C12AJ(0));
        this.LLIZ = mutableLiveData;
        this.LLIZLLLIL = mutableLiveData;
        C09IC.LJJI(ViewModelKt.getViewModelScope(this), new C861640Xr8(new C12AI(this, null), c2252331DDrLIZIZ));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        wQ2().release();
    }

    public final void vQ2(C12AL c12al) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1569440qwY(this, c12al, null), 3);
    }

    public final void zQ2(C19EG c19eg, Aweme aweme, Function1<? super Boolean, Boolean> function1) {
        C0T2Y c0t2y;
        User author;
        if (c19eg != null) {
            this.LLILLL = C486860J7k.LIZIZ(c19eg);
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService.isLogin()) {
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                author.setUid(iUserService.getCurrentUserID());
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.LLILLL;
            ComponentCallbacks componentCallbacksXQ2 = null;
            if (scrollSwitchStateManager != null) {
                componentCallbacksXQ2 = scrollSwitchStateManager.xQ2("page_profile");
            }
            if ((componentCallbacksXQ2 instanceof C0T2Y) && (c0t2y = (C0T2Y) componentCallbacksXQ2) != null) {
                c0t2y.Y3(aweme);
            }
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.LLILLL;
        if (scrollSwitchStateManager2 != null) {
            scrollSwitchStateManager2.KQ2(function1.invoke(Boolean.valueOf(iUserService.isLogin())).booleanValue());
        }
    }
}
