package com.ss.android.ugc.aweme.nimblecard.tako.context;

import X.C0QSJ;
import X.C13IQ;
import X.C14N6;
import X.C14NF;
import X.C14NX;
import X.C14NY;
import X.C14O8;
import X.C1909880zne;
import X.C2097608Jq;
import X.C21328418dO;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS76S0100100_30;

/* JADX INFO: loaded from: classes31.dex */
public final class NimbleTemplateContext extends C14NY implements C0QSJ, InterfaceC1146704e9 {
    public final C14N6 LLILLL;
    public final Context LLILZ;
    public final C21328418dO LLILZIL;
    public final String LLILZLL;
    public LifecycleOwner LLIZ;
    public boolean LLIZLLLIL;
    public Map<String, String> LLJ;
    public TemplateData LLJI;
    public C14NX LLJIJIL;
    public final Map<C14NX, C13IQ<? extends ReusedUISlotAssem<?>>> LLJILJIL;
    public final Map<C14NX, C13IQ<? extends ReusedUIContentAssem<?>>> LLJILJILJ;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{NimbleRenderScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.C14NY, X.InterfaceC665370Q7z
    public final Object getHost() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NimbleRenderScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(NimbleRenderScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void LIZLLL() {
        C14O8 c14o8LJFF;
        C14NX c14nx = this.LLJIJIL;
        if (c14nx != null && (c14o8LJFF = c14nx.LJFF()) != null) {
            ((ArrayList) c14o8LJFF.LIZIZ).clear();
            c14o8LJFF.LIZ.LIZ();
        }
        this.LLJI = null;
        this.LLJ = null;
        ((LinkedHashMap) this.LLJILJIL).clear();
        ((LinkedHashMap) this.LLJILJILJ).clear();
        this.LLIZ = null;
    }

    public final Map<String, Object> LJ() {
        Map<String, Object> mapLIZJ;
        C14NX c14nx = this.LLJIJIL;
        return (c14nx == null || (mapLIZJ = c14nx.LIZJ()) == null) ? C2097608Jq.LJ() : mapLIZJ;
    }

    public final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        getTree().LIZIZ(interfaceC665370Q7z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r5.equals("TakoImage") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        if (r5.equals("Image") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        r0 = new X.C14QW(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010a, code lost:
    
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C14NX LIZJ(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext.LIZJ(java.lang.String):X.14NX");
    }

    public final void LIZIZ(Map<String, ? extends Object> map, C14NF c14nf, boolean z) {
        NimbleViewProps nimbleViewProps;
        String str;
        Object objLJIIZILJ;
        String string;
        C14NX c14nx = this.LLJIJIL;
        if (c14nx == null || map == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            c14nx.LJIILL().put("data", map);
            TemplateData templateData = c14nx.getTemplateData();
            if (templateData != null && (nimbleViewProps = templateData.props) != null && (str = nimbleViewProps.theme) != null && (objLJIIZILJ = c14nx.LJIIZILJ(str)) != null && (string = objLJIIZILJ.toString()) != null) {
                this.LLILZIL.LIZIZ.put("theme", string);
            }
        }
        c14nx.LJIILJJIL(map, c14nf);
        if (z) {
            ExecutorService executorService = C1909880zne.LIZ;
            C1909880zne.LJ(new AwS76S0100100_30(this, jCurrentTimeMillis, 1));
        }
    }

    public NimbleTemplateContext(C14N6 c14n6, Context context, C21328418dO c21328418dO, String str) {
        this.LLILLL = c14n6;
        this.LLILZ = context;
        this.LLILZIL = c21328418dO;
        this.LLILZLL = str;
        final int i = 0;
        new Object(i) { // from class: X.04ln
            public final Map<String, Object> LIZ;
            public final Map<String, Object> LIZIZ;
            public final Map<String, Object> LIZJ;

            {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                this.LIZ = linkedHashMap;
                this.LIZIZ = linkedHashMap2;
                this.LIZJ = linkedHashMap3;
            }
        };
        this.LLJILJIL = new LinkedHashMap();
        this.LLJILJILJ = new LinkedHashMap();
    }
}
