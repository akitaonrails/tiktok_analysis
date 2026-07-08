package com.ss.android.ugc.aweme.topicfeed.ui.tab;

import X.AbstractC1584410rKh;
import X.C1578630rBN;
import X.C1583120rIc;
import X.C19252910Tv;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1583970rJz;
import X.InterfaceC1583190rIj;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.PersonalizedFeedTabConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public class BasePersonalizedTabProtocol extends TopTabProtocol {
    public final int LLILZIL;
    public final Class<? extends Fragment> LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final C1583120rIc LIZJ() {
        return new C1583120rIc(this) { // from class: X.0rID
            public final C1582920rII LIZJ;

            @Override // X.C1583120rIc
            public final AbstractC1584410rKh LIZJ() {
                return this.LIZJ;
            }

            {
                this.LIZJ = new C1582920rII(this.LLILZIL);
            }

            @Override // X.C1583120rIc
            public final InterfaceC1583070rIX LIZ(InterfaceC1583080rIY interfaceC1583080rIY, C1584440rKk c1584440rKk) {
                return new InterfaceC1583070rIX(c1584440rKk) { // from class: X.0rIC
                    public final C1584440rKk LL;
                    public final View LLILLJJLI;
                    public final TextView LLILLL;

                    @Override // X.InterfaceC1583070rIX
                    public final void setText(String str) {
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final float getTextWidth() {
                        TextPaint paint;
                        TextView textView = this.LLILLL;
                        if (textView == null || (paint = textView.getPaint()) == null) {
                            return 0.0f;
                        }
                        return paint.measureText(this.LL.LIZJ);
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final int LIZ() {
                        return getView().getWidth();
                    }

                    @Override // X.InterfaceC1583070rIX
                    public final View getView() {
                        return this.LLILLJJLI;
                    }

                    {
                        this.LL = c1584440rKk;
                        View viewLIZJ = C20673215v0.LIZJ(R.layout.fw2, C1388190mED.LIZ(c1584440rKk.LIZ));
                        this.LLILLJJLI = viewLIZJ;
                        this.LLILLL = (TextView) viewLIZJ.findViewById(android.R.id.text1);
                    }
                };
            }
        };
    }

    public final PersonalizedFeedTabConfig LJIILLIIL() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().LLLL(this.LLILZIL);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().LJIJI(this.LLILZIL);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIILL() {
        return enable();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLIZ;
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
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_TOPIC_TAB_INDEX", this.LLILZIL);
        bundle.putInt("EXTRA_TOPIC_FEED_ID", LJIILLIIL().topicFeedId);
        C786410Ut5.LJJJI("EXTRA_TOPIC_WATCHED_ALL_STRING", context.getString(2131834839), bundle);
        C786410Ut5.LJJJI("EXTRA_TOPIC_DATA_STREAM", C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().getDataSource(), bundle);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LLIZ);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", this.LLJ, bundle);
        C786410Ut5.LJJJI("EXTRA_TOPIC_TAB_HOX_TAG", this.LLIZLLLIL, bundle);
        C1578630rBN.LJIIIIZZ(bundle, "Topic");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        return LJIILLIIL().title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0rIE] */
    public BasePersonalizedTabProtocol(int i, Class<? extends Fragment> cls) {
        this.LLILZIL = i;
        this.LLILZLL = cls;
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
        this.LLIZ = i + LSPassThroughRecordSizeConfig.DEFAULT;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Personalized");
        sbLIZ.append(i);
        this.LLIZLLLIL = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("homepage_topic_");
        sbLIZ2.append(LJIILLIIL().eventTrackingTitle);
        this.LLJ = C2188811AlT.LIZIZ(sbLIZ2);
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLI().LJIIL(new InterfaceC1583190rIj() { // from class: X.0rIE
            @Override // X.InterfaceC1583190rIj
            public final void LIZ() {
                C1582920rII c1582920rII;
                TextView textView;
                AbstractC1584410rKh abstractC1584410rKhLIZIZ = this.LIZ.LJI().LIZIZ();
                if (!(abstractC1584410rKhLIZIZ instanceof C1582920rII) || (c1582920rII = (C1582920rII) abstractC1584410rKhLIZIZ) == null || (textView = c1582920rII.LLILZ) == null) {
                    return;
                }
                textView.setText(c1582920rII.LJIIJ().title);
            }
        });
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIIZ(String str, String str2) {
        AbstractC1584410rKh abstractC1584410rKhLIZIZ = LJI().LIZIZ();
        if (abstractC1584410rKhLIZIZ != null) {
            abstractC1584410rKhLIZIZ.LIZLLL();
        }
    }
}
