package com.ss.android.ugc.aweme.tako.botpage.components.csi;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C1862330yYx;
import X.C197039127h;
import X.C19719912Dl;
import X.C20235014Fo;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1859010yTb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS132S0200000_30;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class CSICreateButtonAssem extends ReusedUISlotAssem<CSICreateButtonAssem> implements InterfaceC712990Rxx<InterfaceC1859010yTb> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CSICreateButtonAssem.class, "messageViewModel", "getMessageViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CSICreateButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1270), AFwS269S0000000_27.get$arr$(220), null, true);
        this.LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 773));
        this.LLJLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1271));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fki;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final MessageViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (MessageViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.d6g);
        C786410Ut5.U8(c197039127h, new ACListenerS132S0200000_30(c197039127h, this, 3));
        c197039127h.setBackgroundRadius(8);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(InterfaceC1859010yTb interfaceC1859010yTb) throws JSONException {
        Map<String, String> commonParams;
        String str;
        String str2;
        String str3;
        Message messageYy1;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJLIL.getValue();
        String str4 = null;
        if (iTakoContextAbility != null) {
            commonParams = iTakoContextAbility.getCommonParams();
        } else {
            commonParams = null;
        }
        TakoCardAbility takoCardAbility = (TakoCardAbility) this.LLJL.getValue();
        String str5 = "";
        if (takoCardAbility == null || (messageYy1 = takoCardAbility.Yy1()) == null || (str = messageYy1.uuid) == null) {
            str = "";
        }
        c1862330yYx.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_create_button");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (commonParams != null && (str3 = commonParams.get("process_id")) != null) {
            str5 = str3;
        }
        Set set = (Set) ((LinkedHashMap) C1862330yYx.LJFF).get(str5);
        if (set != null && set.contains(strLIZIZ)) {
            return;
        }
        C20235014Fo c20235014Fo = C1862330yYx.LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message_id", str);
        if (commonParams != null) {
            str2 = commonParams.get("tako_session_id");
        } else {
            str2 = null;
        }
        jSONObject.put("tako_session_id", str2);
        if (commonParams != null) {
            str4 = commonParams.get("tako_chat_id");
        }
        jSONObject.put("tako_chat_id", str4);
        C1862330yYx.LLII(jSONObject, commonParams);
        c20235014Fo.LIZIZ("tikbot_create_button_show", jSONObject);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1859010yTb interfaceC1859010yTb) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1859010yTb interfaceC1859010yTb) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) throws JSONException {
        tp(interfaceC1587906Jp);
    }
}
