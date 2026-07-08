package com.ss.android.ugc.aweme.nimblecard.tako.element.list;

import X.C14N6;
import X.C14NH;
import X.C14NK;
import X.C14NL;
import X.C14NX;
import X.C14P7;
import X.C1701410uNP;
import X.C21328418dO;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Layout;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes31.dex */
public final class NimbleListICell extends PowerCell<C14NK> {
    public NimbleTemplateContext LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        NimbleTemplateContext nimbleTemplateContext;
        NimbleTemplateContext nimbleTemplateContext2;
        NimbleTemplateContext nimbleTemplateContext3;
        C14NK c14nk = (C14NK) interfaceC1891350zJl;
        super.onBindItemView(c14nk);
        InterfaceC665370Q7z interfaceC665370Q7z = c14nk.LLILLL;
        if (interfaceC665370Q7z != null && (nimbleTemplateContext3 = this.LL) != null) {
            nimbleTemplateContext3.LIZ(interfaceC665370Q7z);
        }
        LifecycleOwner lifecycleOwner = c14nk.LLILZ;
        if (lifecycleOwner != null && (nimbleTemplateContext2 = this.LL) != null) {
            nimbleTemplateContext2.LLIZ = lifecycleOwner;
        }
        Map<String, ? extends Object> map = c14nk.LLILLJJLI;
        if (map != null && (nimbleTemplateContext = this.LL) != null) {
            nimbleTemplateContext.LIZIZ(map, c14nk.LL, false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        TemplateData templateData;
        String string;
        C21328418dO c21328418dOLIZLLL;
        NimbleTemplateContext nimbleTemplateContext;
        View view;
        C14NX c14nx;
        Object objLJIIZILJ;
        TemplateData templateData2;
        Layout layout;
        String str;
        TemplateData templateData3;
        Layout layout2;
        String str2;
        C14NX c14nx2;
        C1701410uNP.LIZ.getClass();
        C14NL c14nl = C1701410uNP.LIZLLL.get(Integer.valueOf(i));
        Object objLJIIZILJ2 = null;
        if (c14nl == null) {
            c14nl = null;
        }
        C14NH c14nh = C14NH.LIZ;
        if (c14nl != null) {
            templateData = c14nl.LIZJ;
        } else {
            templateData = null;
        }
        Context context = viewGroup.getContext();
        if (c14nl != null) {
            string = c14nl.LIZLLL;
            c21328418dOLIZLLL = c14nl.LJ;
        } else {
            string = null;
            c21328418dOLIZLLL = null;
        }
        c14nh.getClass();
        if (templateData == null) {
            nimbleTemplateContext = null;
        } else {
            C14N6 c14n6 = C14NH.LIZIZ;
            if (c21328418dOLIZLLL == null) {
                c21328418dOLIZLLL = C14NH.LIZLLL();
            }
            if (string == null) {
                string = UUID.randomUUID().toString();
            }
            nimbleTemplateContext = new NimbleTemplateContext(c14n6, context, c21328418dOLIZLLL, string);
            C14NH.LJ(null, nimbleTemplateContext, nimbleTemplateContext.LLILZIL);
            nimbleTemplateContext.LLJI = templateData;
            C14NX c14nxLIZJ = nimbleTemplateContext.LIZJ(templateData.type);
            c14nxLIZJ.LJII(templateData);
            nimbleTemplateContext.LLJIJIL = c14nxLIZJ;
        }
        this.LL = nimbleTemplateContext;
        if (nimbleTemplateContext == null || (c14nx2 = nimbleTemplateContext.LLJIJIL) == null || (view = c14nx2.getView()) == null) {
            view = new View(viewGroup.getContext());
        }
        NimbleTemplateContext nimbleTemplateContext2 = this.LL;
        if (nimbleTemplateContext2 != null && (c14nx = nimbleTemplateContext2.LLJIJIL) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (c14nl != null && (templateData3 = c14nl.LIZJ) != null && (layout2 = templateData3.layout) != null && (str2 = layout2.width) != null) {
                    objLJIIZILJ = c14nx.LJIIZILJ(str2);
                } else {
                    objLJIIZILJ = null;
                }
                layoutParams.width = C14P7.LIZJ(objLJIIZILJ);
                if (c14nl != null && (templateData2 = c14nl.LIZJ) != null && (layout = templateData2.layout) != null && (str = layout.height) != null) {
                    objLJIIZILJ2 = c14nx.LJIIZILJ(str);
                }
                layoutParams.height = C14P7.LIZJ(objLJIIZILJ2);
                C786410Ut5.W5(view, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        return view;
    }
}
