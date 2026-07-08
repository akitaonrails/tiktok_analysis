package com.ss.android.ugc.aweme.topicfeed.ui.tab;

import X.C1578630rBN;
import X.C1583060rIW;
import X.C1583100rIa;
import X.C1583120rIc;
import X.C2188811AlT;
import X.C2487409ou;
import X.C786410Ut5;
import X.EnumC1583970rJz;
import X.InterfaceC1583070rIX;
import X.InterfaceC1583090rIZ;
import X.RunnableC990910btR;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.experiment.TopicFeedTabConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class BaseTopicTabProtocol extends TopTabProtocol {
    public final int LLILZIL;
    public final Class<? extends Fragment> LLILZLL;
    public final String LLIZ;
    public final int LLIZLLLIL;
    public final String LLJ;
    public WeakReference<InterfaceC1583070rIX> LLJI;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final C1583120rIc LIZJ() {
        return new C1583120rIc() { // from class: X.0rIV
            @Override // X.C1583120rIc
            public final InterfaceC1583070rIX LIZ(InterfaceC1583080rIY interfaceC1583080rIY, C1584440rKk c1584440rKk) {
                InterfaceC1583070rIX interfaceC1583070rIX = (InterfaceC1583070rIX) interfaceC1583080rIY.LIZ(c1584440rKk);
                this.LIZJ.LLJI = new WeakReference<>(interfaceC1583070rIX);
                return interfaceC1583070rIX;
            }
        };
    }

    public final TopicFeedTabConfig LJIILLIIL() {
        C1583100rIa c1583100rIa = C1583100rIa.LIZ;
        int i = this.LLILZIL;
        c1583100rIa.getClass();
        return C1583100rIa.LIZIZ(i);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIILL() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        return accountUserServiceLJIIJ.isLogin() && !accountUserServiceLJIIJ.LIZ() && LJIILLIIL().LIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getMob() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_TOPIC_TAB_INDEX", this.LLILZIL);
        bundle.putInt("EXTRA_TOPIC_FEED_ID", LJIILLIIL().topicFeedId);
        C786410Ut5.LJJJI("EXTRA_TOPIC_WATCHED_ALL_STRING", LJIILLIIL().watchedAllString, bundle);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LLIZLLLIL);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", this.LLJ, bundle);
        C786410Ut5.LJJJI("EXTRA_TOPIC_TAB_HOX_TAG", this.LLIZ, bundle);
        C1578630rBN.LJIIIIZZ(bundle, "Topic");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        return LJIILLIIL().title;
    }

    public BaseTopicTabProtocol(int i, Class<? extends Fragment> cls) {
        this.LLILZIL = i;
        this.LLILZLL = cls;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Topic");
        sbLIZ.append(i);
        this.LLIZ = C2188811AlT.LIZIZ(sbLIZ);
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
        this.LLIZLLLIL = i + 50;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("homepage_topic_");
        sbLIZ2.append(LJIILLIIL().eventTrackingName);
        this.LLJ = C2188811AlT.LIZIZ(sbLIZ2);
        this.LLJI = new WeakReference<>(null);
        InterfaceC1583090rIZ interfaceC1583090rIZ = new InterfaceC1583090rIZ() { // from class: X.0rIT
            @Override // X.InterfaceC1583090rIZ
            public final void LIZ() {
                InterfaceC1583070rIX interfaceC1583070rIX = this.LIZ.LLJI.get();
                if (interfaceC1583070rIX != null) {
                    interfaceC1583070rIX.setText(this.LIZ.LJIILLIIL().title);
                }
            }
        };
        C1583100rIa.LIZ.getClass();
        C1583060rIW c1583060rIW = new C1583060rIW(interfaceC1583090rIZ);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            c1583060rIW.invoke();
        } else {
            C2487409ou.LIZJ(new RunnableC990910btR(c1583060rIW));
        }
    }
}
