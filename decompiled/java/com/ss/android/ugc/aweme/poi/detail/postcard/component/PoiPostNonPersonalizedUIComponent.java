package com.ss.android.ugc.aweme.poi.detail.postcard.component;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1182380gsG;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C2097608Jq;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiGeneralCommonParams;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class PoiPostNonPersonalizedUIComponent extends BasePanelUIComponent implements INonPersonalizedShowToast, InterfaceC1554640qYg {
    public ViewGroup LLJIJIL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -16063492) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.postcard.component.INonPersonalizedShowToast
    public final void Sh() {
        Resources resources;
        ViewGroup viewGroup = this.LLJIJIL;
        String string = null;
        TextView textView = viewGroup != null ? (TextView) viewGroup.findViewById(R.id.pgb) : null;
        int i = Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.FALSE) ? 2131838203 : 2131838202;
        if (textView != null) {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                string = resources.getString(i);
            }
            textView.setText(string);
        }
        ViewGroup viewGroup2 = this.LLJIJIL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("login_type", ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("scenario", CardStruct.IStatusCode.DEFAULT);
        pairArr[2] = new Pair("enter_from", "poi_detail");
        Map<String, String> mapGo = Go(C2097608Jq.LJIIIIZZ(pairArr));
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via(C724240Sb0.LJI(this)));
        c1185040gwY.getClass();
        C1185040gwY.LJFF("show_feed_personalization_toast", mapGo, c1185050gwZ);
        ViewGroup viewGroup3 = this.LLJIJIL;
        if (viewGroup3 != null) {
            HandlerHook.viewPostDelay(viewGroup3, new ARunnableS109S0100000_9(this, 145), 3000L);
        }
    }

    public final Map<String, String> Go(Map<String, String> map) {
        Serializable serializable;
        Bundle arguments;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        PoiGeneralCommonParams poiGeneralCommonParams = null;
        if (fragmentLJI != null && (arguments = fragmentLJI.getArguments()) != null) {
            serializable = arguments.getSerializable("common_mob_params");
        } else {
            serializable = null;
        }
        if (serializable instanceof PoiGeneralCommonParams) {
            poiGeneralCommonParams = (PoiGeneralCommonParams) serializable;
        }
        C1182380gsG.LIZJ(new PoiCommonMobParams(poiGeneralCommonParams, null, null, "PoiCommonMobParams"), linkedHashMap, true);
        linkedHashMap.putAll(map);
        return linkedHashMap;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.frb);
        this.LLJIJIL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 34, 42), viewGroup);
        }
    }
}
