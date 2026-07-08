package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C1558520qew;
import X.C2097608Jq;
import X.C628830OlV;
import X.C723850SaN;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailVisibilityAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiHeaderContainerAssem extends DynamicAssem implements IPoiDetailVisibilityAbility, ContainerEventDispatcher$IPoiDetailVisibilityAbility {
    public static final Map<String, Integer> LLJJIJI = C2097608Jq.LJIIIIZZ(new Pair("detail_header_container1", Integer.valueOf(R.id.r0a)), new Pair("detail_header_container2", Integer.valueOf(R.id.r0e)), new Pair("detail_header_container3", Integer.valueOf(R.id.r0f)), new Pair("detail_header_container4", Integer.valueOf(R.id.r0g)), new Pair("detail_header_container5", Integer.valueOf(R.id.r0h)), new Pair("detail_header_container6", Integer.valueOf(R.id.r0i)), new Pair("detail_header_container7", Integer.valueOf(R.id.r0j)), new Pair("detail_header_container8", Integer.valueOf(R.id.r0k)), new Pair("detail_header_container9", Integer.valueOf(R.id.r0l)), new Pair("detail_header_container10", Integer.valueOf(R.id.f791r0b)), new Pair("detail_header_container11", Integer.valueOf(R.id.r0c)), new Pair("detail_header_container12", Integer.valueOf(R.id.r0d)));
    public boolean LLJJI = true;
    public LinearLayout LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2t;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void hp() {
        Map<String, Integer> map = LLJJIJI;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C628830OlV> entry : ip().LLJILJIL.entrySet()) {
            String key = entry.getKey();
            C628830OlV value = entry.getValue();
            Integer num = map.get(key);
            if (num != null) {
                value.LLIZLLLIL = num.intValue();
                arrayList.add(value);
            }
        }
        C723850SaN.LIZLLL(this, new AwS372S0200000_6(this, (PoiHeaderContainerAssem) arrayList, (List<C628830OlV>) 15));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> kp() {
        return LLJJIJI;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.container.ui.PoiHeaderContainerAssem for r8v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiHeaderContainerAssem.onViewCreated(android.view.View):void");
    }
}
