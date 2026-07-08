package kotlin.jvm.internal;

import X.C09AY;
import X.C1010603xI;
import X.C1707790uXh;
import X.C1707840uXm;
import X.C1709570uaZ;
import X.C1741890vQh;
import X.C1745310vWD;
import X.C1745340vWG;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1746460vY4;
import X.C1752850viN;
import X.C1752970viZ;
import X.C893803eS;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpProductCardButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductTile;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendFeedCell;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public class AwS12S0410000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS12S0410000_26 awS12S0410000_26, Object obj) {
        Object obj2;
        Object obj3;
        String str;
        Object obj4;
        String str2;
        Object obj5;
        String str3;
        C1745340vWG c1745340vWG;
        InputItemDTO inputItemDTO;
        C1745340vWG c1745340vWG2;
        String str4;
        InputItemDTO inputItemDTO2;
        Integer num;
        C1745340vWG c1745340vWG3;
        String str5;
        HashMap<String, Object> mapLJIIJ;
        InputItemDTO inputItemDTO3;
        InputItemDTO inputItemDTO4;
        LaneParams laneParams = (LaneParams) obj;
        HashMap<String, Object> map = ((C1745480vWU) awS12S0410000_26.l0).LIZ.LLJJIJIIJIL;
        String str6 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        laneParams.plusAssign("is_fullscreen", Integer.valueOf(((C1745480vWU) awS12S0410000_26.l0).LIZ.LLLLLIL ? 1 : 0));
        laneParams.plusAssign("fill_type", ((C1745480vWU) awS12S0410000_26.l0).LIZ.LLLLL.type());
        laneParams.plusAssign("page_name", ((C1745480vWU) awS12S0410000_26.l0).LIZ.getPageName());
        HashMap<String, Object> map2 = ((C1745480vWU) awS12S0410000_26.l0).LIZ.LLJJIJIIJIL;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        } else {
            obj3 = null;
        }
        laneParams.plusAssign("entrance_info", obj3);
        C1745680vWo c1745680vWo = (C1745680vWo) awS12S0410000_26.l1;
        String str7 = "";
        if (c1745680vWo == null || (inputItemDTO4 = c1745680vWo.LIZ) == null || (str = inputItemDTO4.key) == null) {
            str = "";
        }
        laneParams.plusAssign("input_box_name", str);
        String str8 = "1";
        if (((Long) awS12S0410000_26.l2) == null) {
            laneParams.plusAssign("stay_time", CardStruct.IStatusCode.DEFAULT);
            obj4 = "1";
        } else {
            laneParams.plusAssign("stay_time", String.valueOf(SystemClock.elapsedRealtime() - ((Long) awS12S0410000_26.l2).longValue()));
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        Map<String, ? extends Object> map3 = (Map) awS12S0410000_26.l3;
        if (map3 != null) {
            laneParams.withNotCheckParams(map3);
        }
        C1745680vWo c1745680vWo2 = (C1745680vWo) awS12S0410000_26.l1;
        if (c1745680vWo2 != null && (inputItemDTO3 = c1745680vWo2.LIZ) != null) {
            str2 = inputItemDTO3.key;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str2, "address_searchbar")) {
            C1745680vWo c1745680vWo3 = (C1745680vWo) awS12S0410000_26.l1;
            if (c1745680vWo3 != null && (c1745340vWG3 = c1745680vWo3.LIZJ) != null && (str5 = c1745340vWG3.LJFF) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str5)) != null) {
                laneParams.putAll(mapLJIIJ);
            }
            C1745680vWo c1745680vWo4 = (C1745680vWo) awS12S0410000_26.l1;
            if (c1745680vWo4 != null && (num = c1745680vWo4.LJIIL) != null && num.intValue() == 1) {
                str7 = "paste_fill";
            }
            laneParams.plusAssign("input_method", str7);
            if (awS12S0410000_26.z4) {
                obj5 = "1";
            } else {
                obj5 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams.plusAssign("has_normal_input", obj5);
            laneParams.plusAssign("has_auto_input", obj4);
            C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
            C1745680vWo c1745680vWo5 = (C1745680vWo) awS12S0410000_26.l1;
            if (c1745680vWo5 != null && (inputItemDTO2 = c1745680vWo5.LIZ) != null) {
                str3 = inputItemDTO2.key;
            } else {
                str3 = null;
            }
            c1746460vY4.getClass();
            laneParams.plusAssign("has_sug_input", C893803eS.LIZ(C1746460vY4.LIZJ(str3)));
            C1745680vWo c1745680vWo6 = (C1745680vWo) awS12S0410000_26.l1;
            if (c1745680vWo6 != null) {
                c1745340vWG = c1745680vWo6.LIZJ;
            } else {
                c1745340vWG = null;
            }
            if (!C1745310vWD.LIZ(c1745340vWG)) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            laneParams.plusAssign("is_valid", str8);
            C1745680vWo c1745680vWo7 = (C1745680vWo) awS12S0410000_26.l1;
            if (c1745680vWo7 != null && (c1745340vWG2 = c1745680vWo7.LIZJ) != null && (str4 = c1745340vWG2.LIZLLL) != null) {
                laneParams.plusAssign("strong_fail_reason", str4);
            }
            laneParams.plusAssign("is_same_auto", CardStruct.IStatusCode.DEFAULT);
            Map map4 = (Map) awS12S0410000_26.l3;
            if (map4 != null) {
                laneParams.putAll(map4);
            }
            C1745680vWo c1745680vWo8 = (C1745680vWo) awS12S0410000_26.l1;
            if (c1745680vWo8 != null && (inputItemDTO = c1745680vWo8.LIZ) != null) {
                str6 = inputItemDTO.key;
            }
            Map<String, ? extends Object> mapLIZLLL = C1746460vY4.LIZLLL(str6);
            if (mapLIZLLL != null) {
                laneParams.withNotCheckParams(mapLIZLLL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S0410000_26 awS12S0410000_26, Object obj) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        HashMap<String, Object> mapLJIIJ2;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam;
        LaneParams laneParams = (LaneParams) obj;
        C1752850viN.LIZ(laneParams, ((ProductRecommendFeedCell) awS12S0410000_26.l0).LLJ);
        laneParams.plusAssign("item_order", Integer.valueOf(((ProductRecommendFeedCell) awS12S0410000_26.l0).getPosition() + 1));
        ProductTile productTile = (ProductTile) awS12S0410000_26.l1;
        if (productTile != null && (bCMStandardTrack = productTile.standardEvent) != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue());
            }
        }
        String str2 = ((C1752970viZ) awS12S0410000_26.l2).LLJ;
        if (str2 != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str2)) != null) {
            laneParams.putAll(mapLJIIJ2);
        }
        String str3 = ((ProductTile) awS12S0410000_26.l1).daInfo;
        if (str3 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str3)) != null) {
            laneParams.putAll(mapLJIIJ);
        }
        if (awS12S0410000_26.z4) {
            PdpProductCardButton pdpProductCardButton = ((ProductTile) awS12S0410000_26.l1).cartButton;
            if (pdpProductCardButton != null) {
                str = pdpProductCardButton.daInfo;
            } else {
                str = null;
            }
            laneParams.putAll(C1010603xI.LIZ(str));
        }
        Map<String, ? extends Object> map = (Map) awS12S0410000_26.l3;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS12S0410000_26 awS12S0410000_26, Object obj) throws JSONException {
        C1707840uXm c1707840uXm = (C1707840uXm) awS12S0410000_26.l0;
        Context context = (Context) awS12S0410000_26.l1;
        C1707790uXh c1707790uXh = (C1707790uXh) awS12S0410000_26.l2;
        c1707790uXh.LIZJ = true;
        c1707840uXm.LIZ(context, (String) obj, c1707790uXh, (C1709570uaZ) awS12S0410000_26.l3, awS12S0410000_26.z4);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS12S0410000_26 awS12S0410000_26, Object obj) {
        String str;
        Map<String, String> trackParam;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("item_order", Integer.valueOf(((ProductRecommendFeedCell) awS12S0410000_26.l0).getPosition() + 1));
        BCMStandardTrack bCMStandardTrack = ((ProductTile) awS12S0410000_26.l1).standardEvent;
        if (bCMStandardTrack != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue());
            }
        }
        Map<String, ? extends Object> map = (Map) awS12S0410000_26.l2;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        laneParams.putAll(C1010603xI.LIZ(((C1752970viZ) awS12S0410000_26.l3).LLJ));
        laneParams.putAll(C1010603xI.LIZ(((ProductTile) awS12S0410000_26.l1).daInfo));
        if (awS12S0410000_26.z4) {
            PdpProductCardButton pdpProductCardButton = ((ProductTile) awS12S0410000_26.l1).cartButton;
            if (pdpProductCardButton != null) {
                str = pdpProductCardButton.daInfo;
            } else {
                str = null;
            }
            laneParams.putAll(C1010603xI.LIZ(str));
        }
        laneParams.remove((Object) "product_id");
        laneParams.remove((Object) "parent_product_id");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS12S0410000_26 awS12S0410000_26, Object obj) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        HashMap<String, Object> mapLJIIJ2;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam;
        LaneParams laneParams = (LaneParams) obj;
        C1752850viN.LIZ(laneParams, ((ProductRecommendFeedCell) awS12S0410000_26.l0).LLJ);
        ProductTile productTile = (ProductTile) awS12S0410000_26.l1;
        if (productTile != null && (bCMStandardTrack = productTile.standardEvent) != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams.put(entry.getKey(), entry.getValue());
            }
        }
        String str2 = ((C1752970viZ) awS12S0410000_26.l2).LLJ;
        if (str2 != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str2)) != null) {
            laneParams.putAll(mapLJIIJ2);
        }
        String str3 = ((ProductTile) awS12S0410000_26.l1).daInfo;
        if (str3 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str3)) != null) {
            laneParams.putAll(mapLJIIJ);
        }
        if (awS12S0410000_26.z4) {
            PdpProductCardButton pdpProductCardButton = ((ProductTile) awS12S0410000_26.l1).cartButton;
            if (pdpProductCardButton != null) {
                str = pdpProductCardButton.daInfo;
            } else {
                str = null;
            }
            laneParams.putAll(C1010603xI.LIZ(str));
        }
        Map<String, ? extends Object> map = (Map) awS12S0410000_26.l3;
        if (map != null) {
            laneParams.withParamsGroup(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS12S0410000_26 awS12S0410000_26, Object obj) {
        Object objLIZ;
        int iIntValue;
        String str;
        Integer num;
        DeliveryInstructionState deliveryInstructionState = (DeliveryInstructionState) obj;
        Object objLIZ2 = null;
        DeliveryInstructionViewModel deliveryInstructionViewModel = (DeliveryInstructionViewModel) awS12S0410000_26.l0;
        boolean z = awS12S0410000_26.z4;
        SaveData saveData = (SaveData) awS12S0410000_26.l1;
        Response response = (Response) awS12S0410000_26.l2;
        Address address = (Address) awS12S0410000_26.l3;
        deliveryInstructionViewModel.getClass();
        LaneParams laneParams = new LaneParams();
        int i = !z ? 1 : 0;
        laneParams.plusAssign("is_success", Integer.valueOf(i));
        laneParams.plusAssign("is_valid", Integer.valueOf(i));
        Object lowerCase = null;
        if (saveData != null) {
            objLIZ = saveData.LIZ();
        } else {
            objLIZ = null;
        }
        laneParams.plusAssign("fail_reason", objLIZ);
        if (saveData != null) {
            objLIZ2 = saveData.LIZ();
        }
        laneParams.plusAssign("invalid_reason_code", objLIZ2);
        laneParams.plusAssign("err_code", Integer.valueOf(response.code));
        DeliveryInstructionInfo deliveryInstructionInfo = address.deliveryInstructionInfo;
        if (deliveryInstructionInfo != null && (num = deliveryInstructionInfo.instructionType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        laneParams.plusAssign("delivery_instruction_type", Integer.valueOf(iIntValue));
        Region region = address.region;
        if (region != null && (str = region.code) != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        }
        laneParams.plusAssign("location", lowerCase);
        return deliveryInstructionState.copy(-1, deliveryInstructionState.saveLoadingStatus, deliveryInstructionState.itemList, deliveryInstructionState.pageLoaded, deliveryInstructionState.editDeliveryInstruction, deliveryInstructionState.curSelectItem, deliveryInstructionState.scrollerPos, deliveryInstructionState.backEvent, laneParams, deliveryInstructionState.toast, deliveryInstructionState.logDuration);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS12S0410000_26(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductTile r3, X.C1752970viZ r4, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendFeedCell r5, java.util.Map r6, boolean r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            switch(r8) {
                case 1: goto L15;
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L15;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r6
            r1.l3 = r4
            r1.z4 = r7
            r0 = 1
        L11:
            r1.<init>(r0)
            return
        L15:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r1.z4 = r7
            r1.l3 = r6
            r0 = 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS12S0410000_26.<init>(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductTile, X.0viZ, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendFeedCell, java.util.Map, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0410000_26(C1707840uXm c1707840uXm, Context context, C1707790uXh c1707790uXh, C1709570uaZ c1709570uaZ, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1707840uXm;
        this.l1 = context;
        this.l2 = c1707790uXh;
        this.l3 = c1709570uaZ;
        this.z4 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS12S0410000_26(C1745480vWU c1745480vWU, C1745480vWU c1745480vWU2, C1745680vWo c1745680vWo, Long l, Map<String, ? extends Object> map, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c1745480vWU;
        this.l1 = c1745480vWU2;
        this.l2 = c1745680vWo;
        this.l3 = l;
        this.z4 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS12S0410000_26(DeliveryInstructionViewModel deliveryInstructionViewModel, DeliveryInstructionViewModel deliveryInstructionViewModel2, boolean z, SaveData saveData, Response<SaveData> response, Address address) {
        super(1);
        this.$t = address;
        this.l0 = deliveryInstructionViewModel;
        this.z4 = deliveryInstructionViewModel2;
        this.l1 = z;
        this.l2 = saveData;
        this.l3 = response;
    }
}
