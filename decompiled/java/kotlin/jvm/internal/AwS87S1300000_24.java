package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C0N5C;
import X.C1766860w4y;
import X.C1767800w6U;
import X.C1767950w6j;
import X.C189200o6;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C919503ib;
import X.C992660bwG;
import X.EnumC1607270rvZ;
import X.EnumC1982807pi;
import X.EnumC992650bwF;
import X.InterfaceC1607380rvk;
import X.InterfaceC1608820ry4;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.vm.AvatarControllerVM;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallShopCartAssem;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class AwS87S1300000_24 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS87S1300000_24 awS87S1300000_24) {
        String str;
        View viewLo;
        ((MixMallShopCartAssem) awS87S1300000_24.l1).getClass();
        if (C1767800w6U.LJ()) {
            Fragment fragmentLJI = C724240Sb0.LJI((MixMallShopCartAssem) awS87S1300000_24.l1);
            if (fragmentLJI == null || (viewLo = fragmentLJI.getView()) == null) {
                viewLo = ((MixMallShopCartAssem) awS87S1300000_24.l1).Lo();
            }
            C1766860w4y c1766860w4y = C1766860w4y.LIZ;
            String cCode = C0N5C.TOP_MALL_RIGHT_SHOP_CAR.getCCode();
            String dCode = EnumC1982807pi.DEFAULT_D_CODE.getDCode();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("origin_is_mall_tab", "homepage_mall");
            c1766860w4y.getClass();
            C1766860w4y.LJI(viewLo, cCode, dCode, linkedHashMap, null);
        }
        Context context = (Context) awS87S1300000_24.l2;
        MixMallShopCartAssem mixMallShopCartAssem = (MixMallShopCartAssem) awS87S1300000_24.l1;
        String strReplace = awS87S1300000_24.s0;
        int i = C992660bwG.LIZ[((EnumC992650bwF) awS87S1300000_24.l3).ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "button";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "bubble";
        }
        mixMallShopCartAssem.getClass();
        if (!TextUtils.isEmpty(strReplace)) {
            try {
                Uri uri = UriProtector.parse(strReplace);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    JSONObject jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    if (C1767800w6U.LJ()) {
                        if (jSONObject.has("enter_from")) {
                            C1767950w6j.LIZ.getClass();
                            jSONObject.put("enter_from", C1767950w6j.LJFF());
                        }
                        jSONObject.put("enter_method", str);
                    }
                    if (!jSONObject.has("traffic_source_list")) {
                        jSONObject.putOpt("traffic_source_list", new JSONArray(new int[]{6}));
                    }
                    String string = uri.toString();
                    Regex regex = new Regex("(trackParams=[^&]*)");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("trackParams=");
                    sbLIZ.append(URLEncoder.encode(C786410Ut5.J3(jSONObject), "UTF-8"));
                    strReplace = regex.replace(string, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
                C189200o6.m2constructorimpl(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ(strReplace);
        }
        C919503ib.LIZIZ(context, strReplace, new LinkedHashMap(), false).open();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS87S1300000_24 awS87S1300000_24) {
        Map<EnumC1607270rvZ, InterfaceC1608820ry4<?, ?>> mapVQ2 = ((AvatarControllerVM) awS87S1300000_24.l1).vQ2();
        String str = awS87S1300000_24.s0;
        InterfaceC1607380rvk interfaceC1607380rvk = (InterfaceC1607380rvk) awS87S1300000_24.l2;
        Object obj = awS87S1300000_24.l3;
        for (Map.Entry<EnumC1607270rvZ, InterfaceC1608820ry4<?, ?>> entry : mapVQ2.entrySet()) {
            entry.getKey();
            InterfaceC1608820ry4<?, ?> value = entry.getValue();
            if (value != null) {
                value.LIZJ(str, interfaceC1607380rvk, obj);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1300000_24(MixMallShopCartAssem mixMallShopCartAssem, Context context, String str, EnumC992650bwF enumC992650bwF, int i) {
        super(0);
        this.$t = i;
        this.l1 = mixMallShopCartAssem;
        this.l2 = context;
        this.s0 = str;
        this.l3 = enumC992650bwF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS87S1300000_24(AvatarControllerVM avatarControllerVM, String str, String str2, InterfaceC1607380rvk interfaceC1607380rvk, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l1 = avatarControllerVM;
        this.s0 = str2;
        this.l2 = interfaceC1607380rvk;
        this.l3 = obj;
    }
}
