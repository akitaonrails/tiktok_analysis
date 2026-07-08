package com.ss.android.ugc.aweme.topic.movie.creator;

import X.AbstractC2211791BhR;
import X.C098200Yq;
import X.C0HZQ;
import X.C0OAT;
import X.C0P4I;
import X.C1005003wO;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C189200o6;
import X.C2211751BhN;
import X.C444960Hcc;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import Y.ACListenerS144S0100000_9;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MovieSearchItemCell extends PowerCell<C0OAT> {
    public TopicSearchListAssem.TopicSelectedAbility LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(currentLifecycleOwner);
            this.LL = fragmentLJI != null ? (TopicSearchListAssem.TopicSelectedAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), TopicSearchListAssem.TopicSelectedAbility.class, null) : null;
        }
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0Oio
            public Function0<String> LJ;
            public final float LJFF = 0.001f;
            public final C638890P4d LJI;

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return this.LJFF;
            }

            {
                this.LJ = new AwS553S0100000_9(this, 1546);
                this.LJI = new C638890P4d(this, 4);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        SpannableString spannableString;
        int i;
        String strValueOf;
        Double dValueOf;
        Integer num;
        Double dValueOf2;
        boolean zUB0;
        List<String> urlList;
        String str;
        Double d;
        Integer num2;
        Double dValueOf3;
        int iIntValue;
        C0OAT c0oat = (C0OAT) interfaceC1891350zJl;
        TopicRawInfo topicRawInfo = c0oat.LL;
        View view = this.itemView;
        int i2 = R.id.title;
        TextView textView = (TextView) view.findViewById(R.id.title);
        String str2 = topicRawInfo.title;
        if (str2 != null) {
            spannableString = new SpannableString(str2);
            List<Position> list = c0oat.LLILLJJLI;
            if (list != null) {
                for (Position position : list) {
                    try {
                        C786410Ut5.p2(spannableString, new StyleSpan(1), position.getBegin(), position.getEnd() + 1, 18);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
                    if (currentLifecycleOwner != null) {
                        if (C724240Sb0.LIZ(currentLifecycleOwner) != null) {
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            try {
                                C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), position.getBegin(), position.getEnd() + 1, 18);
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C189200o6.m2constructorimpl(new C098200Yq(th2));
                            }
                        }
                        View viewFindViewById = this.itemView.findViewById(i2);
                        if (C444960Hcc.LIZJ(this.itemView.getContext())) {
                            i = 4;
                        } else {
                            i = 3;
                        }
                        viewFindViewById.setTextDirection(i);
                        TextView textView2 = (TextView) this.itemView.findViewById(R.id.wlq);
                        String str3 = "";
                        if (C444960Hcc.LIZIZ() && (d = topicRawInfo.externalRating) != null && d.doubleValue() != 0.0d && (num2 = topicRawInfo.year) != null && num2.intValue() != 0) {
                            StringBuilder sb = new StringBuilder();
                            Double d2 = topicRawInfo.externalRating;
                            if (d2 != null) {
                                dValueOf3 = Double.valueOf(((double) ((int) (((double) 10) * d2.doubleValue()))) / 10.0d);
                            } else {
                                dValueOf3 = null;
                            }
                            sb.append(dValueOf3);
                            sb.append(" IMDb · ");
                            sb.append(topicRawInfo.year);
                            strValueOf = sb.toString();
                        } else {
                            Double d3 = topicRawInfo.externalRating;
                            if (d3 != null && d3.doubleValue() != 0.0d && (num = topicRawInfo.year) != null && num.intValue() != 0) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(topicRawInfo.year);
                                sb2.append(" · IMDb ");
                                Double d4 = topicRawInfo.externalRating;
                                if (d4 != null) {
                                    dValueOf2 = Double.valueOf(((double) ((int) (((double) 10) * d4.doubleValue()))) / 10.0d);
                                } else {
                                    dValueOf2 = null;
                                }
                                sb2.append(dValueOf2);
                                strValueOf = sb2.toString();
                            } else {
                                Double d5 = topicRawInfo.externalRating;
                                if (d5 != null && d5.doubleValue() != 0.0d) {
                                    StringBuilder sb3 = new StringBuilder("IMDb ");
                                    Double d6 = topicRawInfo.externalRating;
                                    if (d6 != null) {
                                        dValueOf = Double.valueOf(((double) ((int) (d6.doubleValue() * ((double) 10)))) / 10.0d);
                                    } else {
                                        dValueOf = null;
                                    }
                                    sb3.append(dValueOf);
                                    strValueOf = sb3.toString();
                                } else {
                                    Integer num3 = topicRawInfo.year;
                                    if (num3 == null || num3.intValue() == 0) {
                                        strValueOf = "";
                                    } else {
                                        strValueOf = String.valueOf(topicRawInfo.year);
                                    }
                                }
                            }
                        }
                        textView2.setText(strValueOf);
                        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 136), this.itemView);
                        C0HZQ c0hzq = (C0HZQ) this.itemView.findViewById(R.id.uki);
                        C786410Ut5.D7(c0hzq, null);
                        TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility = this.LL;
                        if (topicSelectedAbility != null) {
                            String str4 = topicRawInfo.id;
                            if (str4 == null) {
                                str4 = "";
                            }
                            zUB0 = topicSelectedAbility.uB0(str4);
                        } else {
                            zUB0 = false;
                        }
                        c0hzq.setChecked(zUB0);
                        C786410Ut5.D7(c0hzq, new C0P4I(c0oat, c0hzq, this, topicRawInfo, 3));
                        UrlModel urlModel = topicRawInfo.cover;
                        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
                            str3 = str;
                        }
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str3);
                        c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.cover));
                        c1331670kl3LJIIIZ.LJIIJ(new C1005003wO(this.itemView.findViewById(R.id.cover)));
                    }
                    i2 = R.id.title;
                }
            }
        } else {
            spannableString = null;
        }
        textView.setText(spannableString);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fw3, viewGroup, false);
    }
}
