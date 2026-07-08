package kotlin.jvm.internal;

import X.C01GW;
import X.C07F0;
import X.C07GB;
import X.C07XJ;
import X.C09AY;
import X.C0CMS;
import X.C0P7U;
import X.C0PCU;
import X.C0PGJ;
import X.C1830207Eu;
import X.C1830407Ew;
import X.C1840007Io;
import X.C642150PGr;
import X.C654820PmK;
import X.C659990Puf;
import X.C661010PwJ;
import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveV2Assem;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.TaskSchedulerOptConfig;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchRootAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoAnchorPriorityProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocal.ISearchVideoBottomAnchorProtocol;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS32S0310000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S0310000_10 awS32S0310000_10, Object obj) {
        ((C654820PmK) obj).LIZIZ = new AwS32S0310000_10((EcStoreLiveV2Assem) awS32S0310000_10.l0, (EcStoreLiveV2Assem) awS32S0310000_10.z3, (boolean) awS32S0310000_10.l1, (AddressCardProducts) awS32S0310000_10.l2, (Map<String, ? extends Object>) 1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS32S0310000_10 awS32S0310000_10, Object obj) {
        String strLIZ;
        String str;
        String string;
        C07XJ c07xj = (C07XJ) obj;
        c07xj.LIZ("is_live", "1");
        C661010PwJ c661010PwJ = ((EcStoreLiveV2Assem) awS32S0310000_10.l0).LLJZIJLIL;
        if (c661010PwJ == null) {
            strLIZ = "";
        } else {
            strLIZ = c661010PwJ.LIZ();
        }
        c07xj.LIZ("anchor_info", strLIZ);
        if (!awS32S0310000_10.z3 && ((AddressCardProducts) awS32S0310000_10.l1) == null) {
            str = "click_live";
        } else {
            str = "ec_entrance";
        }
        c07xj.LIZ("aladdin_button_type", str);
        for (Map.Entry entry : ((Map) awS32S0310000_10.l2).entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            c07xj.LIZ(str2, string);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS32S0310000_10 awS32S0310000_10, Object obj) {
        Assembler assembler = (Assembler) obj;
        SearchRootAssem searchRootAssem = (SearchRootAssem) awS32S0310000_10.l0;
        assembler.EQ2(searchRootAssem, new AwS589S0100000_10(searchRootAssem, 227));
        if (C07F0.LIZ() || awS32S0310000_10.z3) {
            assembler.EQ2((SearchRootAssem) awS32S0310000_10.l0, new AwS25S0010000_10(awS32S0310000_10.z3, 3));
            assembler.LQ2((SearchRootAssem) awS32S0310000_10.l0, new AwS589S0100000_10((View) awS32S0310000_10.l2, 228));
        }
        View view = (View) awS32S0310000_10.l1;
        if (view != null) {
            assembler.LQ2((SearchRootAssem) awS32S0310000_10.l0, new AwS589S0100000_10(view, 229));
        }
        C0P7U.LIZ.getClass();
        C01GW c01gw = C0P7U.LIZJ;
        if (((TaskSchedulerOptConfig) c01gw.getValue()).enableRootAssemSch == 1) {
            C642150PGr.LIZIZ((SearchRootAssem) awS32S0310000_10.l0, C0PGJ.TOP_FIRST_SCREEN_SHOW, C0CMS.NORMAL_PRIORITY.getType(), new AwS254S0300000_10(assembler, (SearchRootAssem) awS32S0310000_10.l0, (View) awS32S0310000_10.l2, 7));
        } else {
            assembler.LQ2((SearchRootAssem) awS32S0310000_10.l0, new AwS589S0100000_10((View) awS32S0310000_10.l2, 231));
        }
        if (C1830207Eu.LIZ()) {
            if (((TaskSchedulerOptConfig) c01gw.getValue()).enableRootAssemSch == 1) {
                C642150PGr.LIZIZ((SearchRootAssem) awS32S0310000_10.l0, C0PGJ.TOP_FIRST_SCREEN_SHOW, C0CMS.NORMAL_PRIORITY.getType(), new AwS411S0200000_10(assembler, (SearchRootAssem) awS32S0310000_10.l0, 37));
            } else {
                assembler.KQ2((SearchRootAssem) awS32S0310000_10.l0, AFwS241S0000000_10.get$arr$(251));
            }
        } else {
            SearchRootAssem searchRootAssem2 = (SearchRootAssem) awS32S0310000_10.l0;
            assembler.LQ2(searchRootAssem2, new AwS589S0100000_10(searchRootAssem2, 232));
        }
        assembler.LQ2((SearchRootAssem) awS32S0310000_10.l0, new AwS589S0100000_10((View) awS32S0310000_10.l2, 222));
        if (!((SearchRootAssem) awS32S0310000_10.l0).LLJJJJ) {
            int iIntValue = ((Number) C1830407Ew.LIZ.getValue()).intValue();
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    assembler.LQ2((SearchRootAssem) awS32S0310000_10.l0, new AwS589S0100000_10((View) awS32S0310000_10.l2, 224));
                }
            } else {
                assembler.LQ2((SearchRootAssem) awS32S0310000_10.l0, new AwS589S0100000_10((View) awS32S0310000_10.l2, 223));
            }
        }
        if (C0PCU.LIZIZ()) {
            SearchRootAssem searchRootAssem3 = (SearchRootAssem) awS32S0310000_10.l0;
            assembler.LQ2(searchRootAssem3, new AwS589S0100000_10(searchRootAssem3, 225));
        }
        if (C1840007Io.LIZ() == 2 && C07GB.LIZ()) {
            SearchRootAssem searchRootAssem4 = (SearchRootAssem) awS32S0310000_10.l0;
            assembler.LQ2(searchRootAssem4, new AwS589S0100000_10(searchRootAssem4, 226));
        }
        List<ISearchVideoAnchorPriorityProtocol> list = (List) C659990Puf.LIZ.getValue();
        SearchRootAssem searchRootAssem5 = (SearchRootAssem) awS32S0310000_10.l0;
        View view2 = (View) awS32S0310000_10.l2;
        for (ISearchVideoAnchorPriorityProtocol iSearchVideoAnchorPriorityProtocol : list) {
            if ((iSearchVideoAnchorPriorityProtocol instanceof ISearchVideoBottomAnchorProtocol) && ((ISearchVideoBottomAnchorProtocol) iSearchVideoAnchorPriorityProtocol).gN2() != null) {
                assembler.LQ2(searchRootAssem5, new AwS376S0200000_10(iSearchVideoAnchorPriorityProtocol, view2, 42));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS32S0310000_10(EcStoreLiveV2Assem ecStoreLiveV2Assem, EcStoreLiveV2Assem ecStoreLiveV2Assem2, boolean z, AddressCardProducts addressCardProducts, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.l0 = ecStoreLiveV2Assem;
        this.z3 = ecStoreLiveV2Assem2;
        this.l1 = z;
        this.l2 = addressCardProducts;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S0310000_10(SearchRootAssem searchRootAssem, boolean z, View view, View view2, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchRootAssem;
        this.z3 = z;
        this.l1 = view;
        this.l2 = view2;
    }
}
