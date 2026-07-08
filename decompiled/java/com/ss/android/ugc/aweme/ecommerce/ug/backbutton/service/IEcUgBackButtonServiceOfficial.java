package com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service;

import X.C1740690vOl;
import X.C1740700vOm;
import X.C1740720vOo;
import X.InterfaceC1364105Vn;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.BackButtonConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.NodeTagAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public interface IEcUgBackButtonServiceOfficial {
    String LIZ();

    Object LIZIZ(ViewGroup viewGroup, C1740690vOl c1740690vOl, String str, AwS570S0100000_26 awS570S0100000_26, C1740700vOm c1740700vOm, InterfaceC1364105Vn interfaceC1364105Vn);

    NodeTagAssem LIZJ();

    boolean LIZLLL(BackButtonConfig backButtonConfig);

    void LJ(Function0<Unit> function0);

    C1740720vOo LJFF(ShopMallMixFragment shopMallMixFragment, ViewGroup viewGroup, DiversionTargetResCfg diversionTargetResCfg, Map map, AwS570S0100000_26 awS570S0100000_26);

    void LJI(AwS570S0100000_26 awS570S0100000_26);

    boolean getInFYP();

    boolean getInMallTab();

    void prepareBackButton(String str, ImageUrlModel imageUrlModel, String str2);

    void releaseBackButton();
}
