package kotlin.jvm.internal;

import X.AbstractC637050Oyl;
import X.C080A;
import X.C080G;
import X.C09AY;
import X.C20554115bn;
import X.C20571615ec;
import X.C20682015wQ;
import X.C20682815wY;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.EnumC20654715s1;
import X.InterfaceC1715506nh;
import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.n;
import com.ss.android.ugc.aweme.fetch.OutreachExtra;
import com.ss.android.ugc.aweme.fetch.OutreachFetchResponse;
import com.ss.android.ugc.aweme.im.chatroom.api.ability.IMChatRoomAlphaVideoAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.outreach.signal.model.OutreachPathEventConfig;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS1S1500100_31 extends C09AY implements Function1 {
    public final int $t;
    public long j6;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S1500100_31 awS1S1500100_31, Object obj) {
        final Function1 function1 = (Function1) obj;
        DataSource dataSource = (DataSource) awS1S1500100_31.l1;
        final EasterEggForShareAssem easterEggForShareAssem = (EasterEggForShareAssem) awS1S1500100_31.l2;
        Bitmap bitmap = (Bitmap) awS1S1500100_31.l3;
        Bitmap bitmap2 = (Bitmap) awS1S1500100_31.l4;
        final String str = awS1S1500100_31.s0;
        final long j = awS1S1500100_31.j6;
        final List list = (List) awS1S1500100_31.l5;
        IMChatRoomAlphaVideoAbility iMChatRoomAlphaVideoAbilityHo = easterEggForShareAssem.Ho();
        if (iMChatRoomAlphaVideoAbilityHo != null) {
            iMChatRoomAlphaVideoAbilityHo.lS0(dataSource, new InterfaceC1715506nh() { // from class: X.0HAm
                public long LIZ;
                public boolean LIZIZ;

                @Override // X.InterfaceC1715506nh
                public final void LJLIIIL() {
                    Set set = (Set) easterEggForShareAssem.LLJJIII.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("repeated_sending");
                    sbLIZ.append(str);
                    if (set.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                        return;
                    }
                    Set set2 = (Set) easterEggForShareAssem.LLJJIII.getValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("repeated_sending");
                    sbLIZ2.append(str);
                    set2.add(C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZ = System.currentTimeMillis();
                    easterEggForShareAssem.So(j, "repeated_sending", str, "shown", null);
                    C01GW c01gw = C279130Awp.LIZ;
                    if (!(((Number) c01gw.getValue()).intValue() == 1) && ((Number) c01gw.getValue()).intValue() != 2) {
                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(easterEggForShareAssem);
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C432230GxB(easterEggForShareAssem, null), 2);
                    }
                    IMEffectNoticeViewModel iMEffectNoticeViewModelGo = easterEggForShareAssem.Go();
                    List<String> list2 = list;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!list2.isEmpty()) {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(iMEffectNoticeViewModelGo), C0PEM.LIZJ, null, new C436610HAd(iMEffectNoticeViewModelGo, list2, jCurrentTimeMillis, null), 2);
                    }
                    easterEggForShareAssem.No(null, str, "repeated_sending", null);
                }

                @Override // X.InterfaceC1715506nh
                public final void onPlayEnd() {
                    if (this.LIZIZ) {
                        return;
                    }
                    this.LIZIZ = true;
                    easterEggForShareAssem.Oo(this.LIZ, "repeated_sending", str);
                    function1.invoke(Boolean.TRUE);
                    SessionInfo sessionInfoJo = easterEggForShareAssem.Jo();
                    if (sessionInfoJo != null) {
                        EasterEggForShareAssem easterEggForShareAssem2 = easterEggForShareAssem;
                        ChatRoomFakeMsgOperatorAbility chatRoomFakeMsgOperatorAbility = (ChatRoomFakeMsgOperatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(easterEggForShareAssem2), ChatRoomFakeMsgOperatorAbility.class, null);
                        if (chatRoomFakeMsgOperatorAbility != null) {
                            C1684506ih c1684506ih = new C1684506ih();
                            c1684506ih.LIZ(sessionInfoJo);
                            c1684506ih.LIZLLL(45);
                            c1684506ih.LIZJ(easterEggForShareAssem2.getContext());
                            c1684506ih.LJI.LIZIZ(C1687006j6.LIZ, new C1687106j7(EnumC1686906j5.EXPLOSION, false));
                            chatRoomFakeMsgOperatorAbility.yl2(c1684506ih, null);
                        }
                    }
                }
            }, C2097608Jq.LJIIIIZZ(new Pair("ringsabell", bitmap), new Pair("thumbnail", bitmap2)), true, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S1500100_31 awS1S1500100_31, Object obj) {
        String str;
        String str2;
        String str3;
        n nVar;
        String str4;
        OutreachFetchResponse outreachFetchResponse = (OutreachFetchResponse) obj;
        C20682015wQ c20682015wQ = (C20682015wQ) awS1S1500100_31.l1;
        String str5 = awS1S1500100_31.s0;
        List list = (List) awS1S1500100_31.l2;
        Map map = (Map) awS1S1500100_31.l3;
        c20682015wQ.getClass();
        C20682015wQ.LJIIIIZZ(str5, list, outreachFetchResponse, map, 1, "success");
        Map<String, String> map2 = outreachFetchResponse.switchMap;
        if (map2 != null) {
            str = map2.get(((EnumC20654715s1) awS1S1500100_31.l4).getTypeName());
        } else {
            str = null;
        }
        if (str != null) {
            Map<String, n> map3 = outreachFetchResponse.bizResp;
            if (map3 == null || (nVar = map3.get(str)) == null) {
                nVar = new n();
            }
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("signal: trigger fetchTiming ");
            sbLIZ.append(awS1S1500100_31.s0);
            sbLIZ.append(", fetch result, outreach: ");
            sbLIZ.append(((EnumC20654715s1) awS1S1500100_31.l4).getTypeName());
            sbLIZ.append(", content: ");
            sbLIZ.append(nVar);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZJ(strLIZIZ);
            C080A.LIZIZ("fetch_dispatch", awS1S1500100_31.s0, ((EnumC20654715s1) awS1S1500100_31.l4).getTypeName(), str, "fetch success");
            AbstractC637050Oyl abstractC637050Oyl = (AbstractC637050Oyl) awS1S1500100_31.l5;
            C20554115bn c20554115bn = new C20554115bn(0, "");
            long j = awS1S1500100_31.j6;
            OutreachExtra outreachExtra = outreachFetchResponse.extra;
            if (outreachExtra != null) {
                str4 = outreachExtra.logId;
            } else {
                str4 = null;
            }
            c20554115bn.LIZJ = str4;
            c20554115bn.LIZLLL = j;
            abstractC637050Oyl.LIZ(c20554115bn, awS1S1500100_31.s0, nVar, (Map) awS1S1500100_31.l3);
            OutreachPathEventConfig outreachPathEventConfigLIZ = C20682815wY.LIZ();
            if (outreachPathEventConfigLIZ != null && outreachPathEventConfigLIZ.outreachCallback) {
                C20684815ws.LJIILLIIL("outreach_callback", C2097608Jq.LJIIJ(new Pair("outreach_type", ((EnumC20654715s1) awS1S1500100_31.l4).getTypeName()), new Pair("action_type", "fetch"), new Pair("outreach_timing_key", awS1S1500100_31.s0), new Pair("outreach_conditions", ((Map) awS1S1500100_31.l3).toString()), new Pair("is_active", "1"), new Pair("error_info", "success")));
            }
        } else {
            C20571615ec c20571615ec2 = C20571615ec.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("signal: trigger fetchTiming ");
            sbLIZ2.append(awS1S1500100_31.s0);
            sbLIZ2.append(", fetch result, mapping key is null");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c20571615ec2.getClass();
            C20571615ec.LIZJ(strLIZIZ2);
            String str6 = awS1S1500100_31.s0;
            String typeName = ((EnumC20654715s1) awS1S1500100_31.l4).getTypeName();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("no mapping key for ");
            sbLIZ3.append(((EnumC20654715s1) awS1S1500100_31.l4).getTypeName());
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            OutreachExtra outreachExtra2 = outreachFetchResponse.extra;
            if (outreachExtra2 != null) {
                str2 = outreachExtra2.logId;
            } else {
                str2 = null;
            }
            C080G.LIZLLL("fetch_dispatch", str6, typeName, 30002, strLIZIZ3, str2, null, 136);
            AbstractC637050Oyl abstractC637050Oyl2 = (AbstractC637050Oyl) awS1S1500100_31.l5;
            C20554115bn c20554115bn2 = new C20554115bn(0, "");
            long j2 = awS1S1500100_31.j6;
            OutreachExtra outreachExtra3 = outreachFetchResponse.extra;
            if (outreachExtra3 != null) {
                str3 = outreachExtra3.logId;
            } else {
                str3 = null;
            }
            c20554115bn2.LIZJ = str3;
            c20554115bn2.LIZLLL = j2;
            abstractC637050Oyl2.LIZ(c20554115bn2, awS1S1500100_31.s0, new n(), (Map) awS1S1500100_31.l3);
            OutreachPathEventConfig outreachPathEventConfigLIZ2 = C20682815wY.LIZ();
            if (outreachPathEventConfigLIZ2 != null && outreachPathEventConfigLIZ2.outreachCallback) {
                C20684815ws.LJIILLIIL("outreach_callback", C2097608Jq.LJIIJ(new Pair("outreach_type", ((EnumC20654715s1) awS1S1500100_31.l4).getTypeName()), new Pair("action_type", "fetch"), new Pair("outreach_timing_key", awS1S1500100_31.s0), new Pair("outreach_conditions", ((Map) awS1S1500100_31.l3).toString()), new Pair("is_active", "1"), new Pair("error_info", "no mapping key")));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0000: IPUT (r11 I:int), (r2 I:kotlin.jvm.internal.AwS1S1500100_31) (LINE:134217728) kotlin.jvm.internal.AwS1S1500100_31.$t int, block:B:2:0x0000 */
    public AwS1S1500100_31(C20682015wQ c20682015wQ, C20682015wQ c20682015wQ2, String str, List<String> list, Map<String, Object> map, EnumC20654715s1 enumC20654715s1, AbstractC637050Oyl abstractC637050Oyl, long j) {
        int i;
        super(1);
        this.$t = i;
        this.l1 = c20682015wQ;
        this.s0 = c20682015wQ2;
        this.l2 = str;
        this.l3 = list;
        this.l4 = map;
        this.l5 = enumC20654715s1;
        this.j6 = abstractC637050Oyl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x000f: IPUT (r10 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS1S1500100_31) (LINE:134283279) kotlin.jvm.internal.AwS1S1500100_31.l5 java.lang.Object, block:B:2:0x0000 */
    public AwS1S1500100_31(DataSource dataSource, DataSource dataSource2, EasterEggForShareAssem easterEggForShareAssem, Bitmap bitmap, Bitmap bitmap2, String str, long j, List<String> list) {
        Object obj;
        super(1);
        this.$t = list;
        this.l1 = dataSource;
        this.l2 = dataSource2;
        this.l3 = easterEggForShareAssem;
        this.l4 = bitmap;
        this.s0 = bitmap2;
        this.j6 = str;
        this.l5 = obj;
    }
}
