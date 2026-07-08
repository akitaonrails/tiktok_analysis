package com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard;

import X.AbstractC1014240cV4;
import X.C1005290cGd;
import X.C1009340cNA;
import X.C1011660cQu;
import X.C1013790cUL;
import X.C1022820ciu;
import X.C1308910kAL;
import X.C21146717pB;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1003440cDe;
import X.InterfaceC1013800cUM;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdAIProductCardCell extends PowerCell<C1005290cGd> {
    public ViewGroup LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public LinearLayout LLILZ;
    public LinearLayout LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxIconView LLIZLLLIL;
    public View LLJ;
    public boolean LLJI;
    public final C1013790cUL LLJIJIL = new C1013790cUL();

    public final void N5() {
        InterfaceC1003440cDe interfaceC1003440cDe;
        C1005290cGd item = getItem();
        if (item == null || (interfaceC1003440cDe = item.LLIZ) == null) {
            return;
        }
        interfaceC1003440cDe.LJ(this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        this.LL = (ViewGroup) view.findViewById(R.id.aqr);
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.ls0);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLILZ = (LinearLayout) view.findViewById(R.id.nhi);
        this.LLILZIL = (LinearLayout) view.findViewById(R.id.niu);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.tv_summary);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.d8d);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.lak);
        this.LLJ = view.findViewById(R.id.fz3);
    }

    public final void L5(String str) {
        String creativeIdStr;
        AwemeRawAd awemeRawAd;
        String str2;
        String str3;
        CRouterCoreModel cRouterCoreModel;
        AIProductItem aIProductItem;
        AbstractC1014240cV4 abstractC1014240cV4;
        AnoleComponentModel anoleComponentModel;
        AIProductItem aIProductItem2;
        C1009340cNA c1009340cNA;
        C1009340cNA c1009340cNA2;
        AwemeRawAd awemeRawAd2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAdAIProductCardCell [trackCardClick], refer = ");
        sbLIZ.append(str);
        sbLIZ.append(",cid = ");
        C1005290cGd item = getItem();
        C1009340cNA c1009340cNA3 = null;
        if (item != null && (c1009340cNA2 = item.LLIZLLLIL) != null && (awemeRawAd2 = c1009340cNA2.LIZLLL) != null) {
            creativeIdStr = awemeRawAd2.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        sbLIZ.append(creativeIdStr);
        C2188811AlT.LIZIZ(sbLIZ);
        C1005290cGd item2 = getItem();
        if (item2 != null && (c1009340cNA = item2.LLIZLLLIL) != null) {
            awemeRawAd = c1009340cNA.LIZLLL;
        } else {
            awemeRawAd = null;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "click", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ(str, "refer");
        C1005290cGd item3 = getItem();
        if (item3 != null && (aIProductItem2 = item3.LL) != null) {
            str2 = aIProductItem2.productId;
        } else {
            str2 = null;
        }
        c1022820ciuLIZLLL.LIZIZ(str2, "product_id");
        C1005290cGd item4 = getItem();
        if (item4 == null || (abstractC1014240cV4 = item4.LLILZLL) == null || (anoleComponentModel = abstractC1014240cV4.LL) == null || (str3 = anoleComponentModel.type) == null) {
            str3 = "search_ad_card_list";
        }
        c1022820ciuLIZLLL.LIZIZ(str3, "component_type");
        c1022820ciuLIZLLL.LJII();
        C1005290cGd item5 = getItem();
        if (item5 != null && (aIProductItem = item5.LL) != null) {
            cRouterCoreModel = aIProductItem.jumpData;
        } else {
            cRouterCoreModel = null;
        }
        Context context = this.itemView.getContext();
        C1005290cGd item6 = getItem();
        if (item6 != null) {
            c1009340cNA3 = item6.LLIZLLLIL;
        }
        C1011660cQu.LIZIZ(context, c1009340cNA3, null, str, null, cRouterCoreModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0345  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r15) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard.SearchAdAIProductCardCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.q6, viewGroup, false);
    }

    public final void I5(LinearLayout linearLayout, AITagLine aITagLine) {
        List<AITagBlock> list;
        List<AITagBlock> list2;
        int iIntValue;
        Object next;
        View viewLIZIZ;
        View view;
        if (aITagLine != null && (list = aITagLine.blocks) != null && !list.isEmpty()) {
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            C1013790cUL c1013790cUL = this.LLJIJIL;
            c1013790cUL.getClass();
            if (linearLayout != null) {
                C786410Ut5.LJJJJI(linearLayout);
                if (aITagLine != null && (list2 = aITagLine.blocks) != null) {
                    Integer num = aITagLine.separatorType;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    boolean z = false;
                    for (AITagBlock aITagBlock : list2) {
                        Iterator it2 = ((List) c1013790cUL.LIZ.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (((InterfaceC1013800cUM) next).LIZ(aITagBlock)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        InterfaceC1013800cUM interfaceC1013800cUM = (InterfaceC1013800cUM) next;
                        if (interfaceC1013800cUM != null && (viewLIZIZ = interfaceC1013800cUM.LIZIZ(linearLayout, aITagBlock)) != null) {
                            if (z) {
                                Context context = linearLayout.getContext();
                                if (iIntValue == 1) {
                                    Space space = new Space(context);
                                    C786410Ut5.f6(space, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))));
                                    view = space;
                                } else {
                                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                                    tuxTextView.setText("·");
                                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                                    if (numLIZJ != null) {
                                        tuxTextView.setTextColor(numLIZJ.intValue());
                                    }
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                    layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                                    layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                                    layoutParams.gravity = 16;
                                    C786410Ut5.R6(tuxTextView, layoutParams);
                                    tuxTextView.setTuxFont(61);
                                    view = tuxTextView;
                                }
                                linearLayout.addView(view);
                            }
                            linearLayout.addView(viewLIZIZ);
                            z = true;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
    }
}
