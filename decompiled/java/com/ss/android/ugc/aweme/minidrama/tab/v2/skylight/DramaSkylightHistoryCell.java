package com.ss.android.ugc.aweme.minidrama.tab.v2.skylight;

import X.AbstractViewOnClickListenerC1165700gRM;
import X.C01GW;
import X.C1308910kAL;
import X.C1322090kVb;
import X.C1324840ka2;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C13LP;
import X.C1578050rAR;
import X.C1578090rAV;
import X.C418440Gaw;
import X.C452501pT;
import X.C718540SGm;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC447230HgH;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.UrlModel;
import com.ss.android.ugc.aweme.minidrama.tab.v2.skylight.DramaSkylightHistoryCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS146S0101000_6;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaSkylightHistoryCell extends PowerCell<C1578050rAR> {
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 773));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 771));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 774));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 775));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 772));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 770));

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: I5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(final C1578050rAR c1578050rAR) {
        int iIntValue;
        int iIntValue2;
        String string;
        List<String> list;
        int iIntValue3;
        int iIntValue4;
        L5(c1578050rAR);
        N5(c1578050rAR);
        UrlModel urlModel = c1578050rAR.LL.urlModel;
        if (urlModel != null) {
            com.ss.android.ugc.aweme.base.model.UrlModel urlModel2 = new com.ss.android.ugc.aweme.base.model.UrlModel();
            urlModel2.setUri(urlModel.uri);
            urlModel2.setUrlList(urlModel.urlList);
            Integer num = urlModel.width;
            if (num != null) {
                iIntValue3 = num.intValue();
            } else {
                iIntValue3 = 0;
            }
            urlModel2.setWidth(iIntValue3);
            Integer num2 = urlModel.height;
            if (num2 != null) {
                iIntValue4 = num2.intValue();
            } else {
                iIntValue4 = 0;
            }
            urlModel2.setHeight(iIntValue4);
            urlModel2.setUrlKey(urlModel.urlKey);
            C1324840ka2.LJIJ(urlModel2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), new InterfaceC447230HgH() { // from class: X.0Gyo
                @Override // X.InterfaceC447230HgH
                public final void accept(Object obj) {
                    int color;
                    C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7((Bitmap) obj, null));
                    c204674156yLIZ.LJFF(20.0f);
                    c204674156yLIZ.LJ(0.04f, 0.16f, 0.52f, 0.8f, 0.0f);
                    c204674156yLIZ.LJI(99.0f);
                    Integer numLJJIIJ = C13LQ.LJJIIJ(1, c204674156yLIZ.LIZ());
                    if (numLJJIIJ != null) {
                        color = numLJJIIJ.intValue();
                    } else {
                        color = ColorProtector.parseColor("#FF2A1001");
                    }
                    int iLJIIL = C2441009hQ.LJIIL(color, 81);
                    DramaSkylightHistoryCell dramaSkylightHistoryCell = this.LIZ;
                    AwS146S0101000_6 awS146S0101000_6 = new AwS146S0101000_6(dramaSkylightHistoryCell, iLJIIL, 2);
                    dramaSkylightHistoryCell.getClass();
                    if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        awS146S0101000_6.invoke();
                    } else {
                        C1701940uOG.LIZIZ().LIZIZ(new ARunnableS106S0100000_6((Object) awS146S0101000_6, 83));
                    }
                }
            });
        }
        TextView textView = (TextView) this.LLILZ.getValue();
        if (textView != null) {
            textView.setText(c1578050rAR.LL.title);
        }
        Integer num3 = c1578050rAR.LL.watchedEpisodes;
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num4 = c1578050rAR.LL.totalEpisodes;
        if (num4 != null) {
            iIntValue2 = num4.intValue();
        } else {
            iIntValue2 = 0;
        }
        Context context = getContext();
        String str = null;
        if (context != null) {
            string = context.getString(2131839413, String.valueOf(iIntValue), String.valueOf(iIntValue2));
        } else {
            string = null;
        }
        TextView textView2 = (TextView) this.LLILZIL.getValue();
        if (textView2 != null) {
            textView2.setText(string);
        }
        RemoteImageView remoteImageView = (RemoteImageView) this.LLILZLL.getValue();
        if (remoteImageView != null) {
            C718540SGm.LIZIZ(remoteImageView);
            UrlModel urlModel3 = c1578050rAR.LL.urlModel;
            if (urlModel3 != null && (list = urlModel3.urlList) != null) {
                str = (String) C13LP.LJJJLL(list);
            }
            C1324840ka2.LJIIJ(remoteImageView, str, remoteImageView.getLayoutParams().width, remoteImageView.getLayoutParams().height);
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0rAJ
            @Override // X.AbstractViewOnClickListenerC1165700gRM
            public final void LIZ(View view) {
                boolean z;
                String string2;
                boolean z2;
                if (view != null) {
                    C1573870r3h c1573870r3h = C1573870r3h.LIZ;
                    this.LLILZ.itemView.getContext();
                    SkylightCommonItem skylightCommonItem = c1578050rAR.LL;
                    Long l = skylightCommonItem.collectionId;
                    Long l2 = skylightCommonItem.category;
                    Boolean bool = skylightCommonItem.isLimitedFree;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("homepage_series_");
                    sbLIZ.append("history_list");
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("source_card", "history_list"), new Pair("series_enter_entrance", C2188811AlT.LIZIZ(sbLIZ)), new Pair("root_scene", "1"));
                    InterfaceC1577950rAH interfaceC1577950rAH = (InterfaceC1577950rAH) this.LLILZ.LL.getValue();
                    if (interfaceC1577950rAH != null && interfaceC1577950rAH.xf()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1573870r3h.getClass();
                    C1573870r3h.LIZ("homepage_series", l, l2, bool, mapLJIIIIZZ, z, "", false);
                    C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                    Long l3 = c1578050rAR.LL.collectionId;
                    String strD9 = null;
                    if (l3 != null) {
                        string2 = l3.toString();
                    } else {
                        string2 = null;
                    }
                    InterfaceC1577950rAH interfaceC1577950rAH2 = (InterfaceC1577950rAH) this.LLILZ.LL.getValue();
                    if (interfaceC1577950rAH2 != null) {
                        strD9 = interfaceC1577950rAH2.d9();
                    }
                    String str2 = C1577260r9A.LIZ;
                    InterfaceC1577950rAH interfaceC1577950rAH3 = (InterfaceC1577950rAH) this.LLILZ.LL.getValue();
                    if (interfaceC1577950rAH3 != null && interfaceC1577950rAH3.xf()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C1611660s2e.LJJJJ(string2, "collection", strD9, "history_list", str2, z2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.itemView);
    }

    public final void L5(C1578050rAR c1578050rAR) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z;
        int iLIZIZ;
        int iLIZLLL = C418440Gaw.LIZLLL(this.itemView.getContext());
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (iLIZLLL > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(600))) {
            z = true;
        } else {
            z = false;
        }
        if (marginLayoutParams != null) {
            int i = c1578050rAR.LLILLJJLI;
            if (i != 1) {
                if (i != 2) {
                    if (z) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170));
                    } else {
                        iLIZIZ = (((iLIZLLL - LLJ) - LLIZLLLIL) - (LLIZ * 2)) / 2;
                    }
                } else {
                    iLIZIZ = ((iLIZLLL - (LLIZLLLIL * 2)) - LLIZ) / 2;
                }
            } else {
                iLIZIZ = iLIZLLL - (LLIZLLLIL * 2);
            }
            marginLayoutParams.width = iLIZIZ;
        }
        C786410Ut5.W5(this.itemView, marginLayoutParams);
    }

    public final void N5(C1578050rAR c1578050rAR) {
        Context context;
        if (c1578050rAR.LLILLL) {
            context = (Context) this.LLILLJJLI.getValue();
        } else {
            context = (Context) this.LLILLL.getValue();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TextView textView = (TextView) this.LLILZ.getValue();
            if (textView != null) {
                textView.setTextColor(iIntValue);
            }
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ2 != null) {
            int iIntValue2 = numLIZJ2.intValue();
            TextView textView2 = (TextView) this.LLILZIL.getValue();
            if (textView2 != null) {
                textView2.setTextColor(iIntValue2);
            }
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ3 != null) {
            int iIntValue3 = numLIZJ3.intValue();
            C1331070kk5 c1331070kk5 = (C1331070kk5) ((C1322090kVb) this.LLILZLL.getValue()).getHierarchy();
            if (c1331070kk5 != null) {
                C1331100kk8 c1331100kk8LIZLLL = c1331070kk5.LIZJ;
                if (c1331100kk8LIZLLL == null) {
                    c1331100kk8LIZLLL = C1331100kk8.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                }
                c1331100kk8LIZLLL.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f))), iIntValue3);
                c1331070kk5.LJJIII(c1331100kk8LIZLLL);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bo2, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1578050rAR c1578050rAR = (C1578050rAR) interfaceC1891350zJl;
        if (!list.isEmpty()) {
            Object obj = ListProtector.get(list, 0);
            if (obj instanceof C1578090rAV) {
                C1578090rAV c1578090rAV = (C1578090rAV) obj;
                boolean z = c1578090rAV.LIZ;
                boolean z2 = c1578090rAV.LIZIZ;
                if (c1578090rAV.LIZJ) {
                    onBindItemView(c1578050rAR);
                    return;
                }
                if (z) {
                    N5(c1578050rAR);
                }
                if (!z2) {
                    return;
                }
                L5(c1578050rAR);
            }
        }
    }
}
