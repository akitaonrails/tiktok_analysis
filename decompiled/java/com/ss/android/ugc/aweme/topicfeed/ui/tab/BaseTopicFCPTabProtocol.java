package com.ss.android.ugc.aweme.topicfeed.ui.tab;

import X.C1578630rBN;
import X.C1583060rIW;
import X.C1583100rIa;
import X.C1583120rIc;
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
import com.ss.android.ugc.aweme.experiment.TopicFeedTabConfig;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class BaseTopicFCPTabProtocol extends TopTabProtocol {
    public final int LLILZIL;
    public final int LLILZLL;
    public final Class<? extends Fragment> LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final int LLJI;
    public WeakReference<InterfaceC1583070rIX> LLJIJIL;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIILL() {
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final C1583120rIc LIZJ() {
        return new C1583120rIc() { // from class: X.0rIU
            @Override // X.C1583120rIc
            public final InterfaceC1583070rIX LIZ(InterfaceC1583080rIY interfaceC1583080rIY, C1584440rKk c1584440rKk) {
                InterfaceC1583070rIX interfaceC1583070rIX = (InterfaceC1583070rIX) interfaceC1583080rIY.LIZ(c1584440rKk);
                this.LIZJ.LLJIJIL = new WeakReference<>(interfaceC1583070rIX);
                return interfaceC1583070rIX;
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getMob() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        String str;
        int i = 0;
        while (true) {
            C1583100rIa.LIZ.getClass();
            TopicFeedTabConfig topicFeedTabConfigLIZIZ = C1583100rIa.LIZIZ(i);
            if (topicFeedTabConfigLIZIZ.topicFeedId == this.LLILZLL) {
                str = topicFeedTabConfigLIZIZ.watchedAllString;
                break;
            }
            i++;
            if (i >= 4) {
                str = "";
                break;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_TOPIC_TAB_INDEX", this.LLILZLL);
        bundle.putInt("EXTRA_TOPIC_FEED_ID", this.LLILZLL);
        C786410Ut5.LJJJI("EXTRA_TOPIC_WATCHED_ALL_STRING", str, bundle);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LLJI);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", this.LLJ, bundle);
        C786410Ut5.LJJJI("EXTRA_TOPIC_TAB_HOX_TAG", this.LLIZLLLIL, bundle);
        C1578630rBN.LJIIIIZZ(bundle, "Topic");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        return context.getResources().getString(this.LLILZIL);
    }

    public BaseTopicFCPTabProtocol(int i, Class cls, String str, String str2, int i2) {
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = cls;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
        this.LLJI = i2 + 50;
        this.LLJIJIL = new WeakReference<>(null);
        InterfaceC1583090rIZ interfaceC1583090rIZ = new InterfaceC1583090rIZ() { // from class: X.0rIS
            @Override // X.InterfaceC1583090rIZ
            public final void LIZ() {
                InterfaceC1583070rIX interfaceC1583070rIX = this.LIZ.LLJIJIL.get();
                if (interfaceC1583070rIX != null) {
                    interfaceC1583070rIX.setText(C1BWL.LIZJ().getString(this.LIZ.LLILZIL));
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
