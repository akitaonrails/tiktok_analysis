package com.ss.android.ugc.aweme.series.feed.tab;

import X.C0B08;
import X.C0RRR;
import X.C1578630rBN;
import X.C1582820rI8;
import X.C1583120rIc;
import X.C786410Ut5;
import X.EnumC1570580qyO;
import X.EnumC1583970rJz;
import X.InterfaceC1577520r9a;
import Y.ACallableS429S0100000_24;
import Y.ARunnableS57S0300000_24;
import Y.AfS193S0100000_24;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.tab.toptab.SeriesTopTabVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesHomeTabProtocol extends TopTabProtocol {
    public final String LLILZIL = "homepage_series";
    public final String LLILZLL = "Drama";
    public final int LLIZ;
    public final Class<? extends Fragment> LLIZLLLIL;
    public final EnumC1570580qyO LLJ;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final C1583120rIc LIZJ() {
        return new C1583120rIc() { // from class: X.0rI3
            @Override // X.C1583120rIc
            public final AbstractC1584410rKh LIZJ() {
                return new AbstractC1584410rKh() { // from class: X.0r5H
                    @Override // X.AbstractC1584410rKh
                    public final void LJII(View view, C1584440rKk c1584440rKk) {
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
                        if (c19egLIZIZ == null) {
                            return;
                        }
                        SeriesTopTabVM seriesTopTabVM = (SeriesTopTabVM) new ViewModelProvider(c19egLIZIZ).get(SeriesTopTabVM.class);
                        seriesTopTabVM.getClass();
                        seriesTopTabVM.LLILLJJLI.LIZ(C11NZ.LJJJJI(new ACallableS429S0100000_24(seriesTopTabVM, 3)).LJL(C11S5.LIZ()).LJJLL(new AfS193S0100000_24(seriesTopTabVM, 24), new C09JN() { // from class: X.05Gf
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("SeriesTopTabVM@c168.handleInit$3");
                                int i = C2187451AjH.LIZ;
                                C1720106oR.LIZJ("SeriesTopTabVM", (Throwable) obj);
                                C1C7U.LIZIZ("SeriesTopTabVM@c168.handleInit$3");
                            }
                        }));
                        HandlerHook.viewPost(view, new ARunnableS57S0300000_24(view, seriesTopTabVM, c19egLIZIZ, 12));
                    }
                };
            }

            @Override // X.C1583120rIc
            public final InterfaceC1583070rIX LIZ(InterfaceC1583080rIY interfaceC1583080rIY, final C1584440rKk c1584440rKk) {
                int i;
                Context context = c1584440rKk.LIZ;
                if (((Boolean) C0B08.LIZ.getValue()).booleanValue()) {
                    i = R.layout.f5c;
                } else {
                    i = R.layout.f5b;
                }
                final View viewLIZJ = C20673215v0.LIZJ(i, C1388190mED.LIZ(context));
                final TextView textView = (TextView) viewLIZJ.findViewById(android.R.id.text1);
                return new InterfaceC1583070rIX() { // from class: X.0rI6
                    @Override // X.InterfaceC1583070rIX
                    public final float getTextWidth() {
                        TextPaint paint;
                        TextView textView2 = textView;
                        if (textView2 == null || (paint = textView2.getPaint()) == null) {
                            return 0.0f;
                        }
                        return paint.measureText(c1584440rKk.LIZJ);
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final int LIZ() {
                        return getView().getWidth();
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final View getView() {
                        return viewLIZJ;
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final void setText(String str) {
                        TextView textView2 = textView;
                        if (textView2 != null) {
                            textView2.setText(str);
                        }
                    }
                };
            }
        };
    }

    public SeriesHomeTabProtocol() {
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
        this.LLIZ = 45;
        SeriesHomeTabAppDiffProtocol.LIZ.getClass();
        this.LLIZLLLIL = C1582820rI8.LIZIZ.getValue().LIZ();
        this.LLJ = EnumC1570580qyO.DRAMA_TAB;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIILL() {
        return enable();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        return (iSeriesFeedServiceLIZIZ == null || (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) == null || !interfaceC1577520r9aLIZIZ.getEnable()) ? false : true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1570580qyO LJFF() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getMob() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LLIZ);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_series", bundle);
        C1578630rBN.LJIIIIZZ(bundle, "Series");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        if (((Boolean) C0B08.LIZ.getValue()).booleanValue()) {
            return context.getString(2131848199);
        }
        return context.getString(2131836533);
    }
}
