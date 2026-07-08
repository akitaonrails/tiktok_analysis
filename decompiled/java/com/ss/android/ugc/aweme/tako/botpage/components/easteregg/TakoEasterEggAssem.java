package com.ss.android.ugc.aweme.tako.botpage.components.easteregg;

import X.C01GW;
import X.C0PEM;
import X.C1558520qew;
import X.C1862030yYT;
import X.C1862330yYx;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2277781EDo;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C844390XAn;
import X.C844420XAq;
import X.InterfaceC1861530yXf;
import X.InterfaceC844400XAo;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.easteregg.TakoEasterEggAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.easteregg.model.TakoEasterEggConfig;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Extra;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoEasterEggAssem extends UISlotAssem implements InterfaceC844400XAo {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 776));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 775));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fkl;
    }

    @Override // X.InterfaceC844400XAo
    public final void LJLJJLL() {
        ((C2277781EDo) this.LLJJIII.getValue()).LJ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        List<TakoEasterEggConfig> list = C844420XAq.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C844390XAn(null), 3);
        C844420XAq.LIZJ = null;
    }

    @Override // X.InterfaceC844400XAo
    public final void V4(C1862030yYT c1862030yYT) {
        Map<String, String> mapLJ;
        String str = c1862030yYT.LIZJ;
        if (str != null && str.length() != 0) {
            C2277781EDo c2277781EDo = (C2277781EDo) this.LLJJIII.getValue();
            String str2 = c1862030yYT.LIZJ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            c2277781EDo.LJI(str2);
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str4 = c1862030yYT.LIZIZ;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c1862030yYT.LIZ;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = c1862030yYT.LIZLLL;
            if (str6 != null) {
                str3 = str6;
            }
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
            if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C1862330yYx.LJJJLIIL(c1862330yYx, str4, str5, str3, mapLJ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
        if (iMessageAbility != null) {
            iMessageAbility.H61(new InterfaceC1861530yXf() { // from class: X.0yYS
                @Override // X.InterfaceC1861530yXf
                public final void LIZ(Message message) {
                }

                @Override // X.InterfaceC1861530yXf
                public final void LIZIZ(Message message) {
                }

                @Override // X.InterfaceC1861530yXf
                public final void LIZJ(Message message, int i, String str, Map<String, String> map) {
                }

                @Override // X.InterfaceC1861530yXf
                public final void LIZLLL(Message message, int i, boolean z, String str, int i2, String str2, Extra extra, String str3, String str4, Integer num, Integer num2, String str5, String str6, C1862650yZT c1862650yZT, Map map) {
                    Message messageDL1;
                    String str7;
                    List<TakoEasterEggConfig> list;
                    TakoEasterEggConfig next;
                    String str8;
                    TakoEasterEggAssem takoEasterEggAssem = this.LIZ;
                    if (!z) {
                        int i3 = message.msgType;
                        if ((i3 == 2 || i3 == 5) && message.LIZIZ == 6) {
                            IMessageAbility iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(takoEasterEggAssem), IMessageAbility.class, null);
                            if (iMessageAbility2 != null) {
                                messageDL1 = iMessageAbility2.DL1(message.replyMsgId);
                            } else {
                                messageDL1 = null;
                            }
                            List<TakoEasterEggConfig> list2 = C844420XAq.LIZ;
                            if (messageDL1 != null && message.botId == 1) {
                                TakoMixFeed takoMixFeedLJIIIZ = messageDL1.LJIIIZ();
                                if (takoMixFeedLJIIIZ != null) {
                                    str7 = takoMixFeedLJIIIZ.text;
                                } else {
                                    str7 = null;
                                }
                                String str9 = message.msgId;
                                if (str7 != null && str7.length() != 0 && str9 != null && str9.length() != 0 && !C1858670yT3.LJIIL(message) && (list = C844420XAq.LIZ) != null && !list.isEmpty()) {
                                    C1862030yYT c1862030yYT = new C1862030yYT();
                                    List<TakoEasterEggConfig> list3 = C844420XAq.LIZ;
                                    if (list3 != null) {
                                        Iterator<TakoEasterEggConfig> it2 = list3.iterator();
                                        loop0: while (true) {
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                Collection<String> collectionValues = ((LinkedHashMap) next.LIZLLL).values();
                                                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                                                    for (String str10 : collectionValues) {
                                                        if (C123100dR.LIZ(str10)) {
                                                            Locale locale = Locale.ROOT;
                                                            if (a0.LJJIIZI(str7.toLowerCase(locale), str10.toLowerCase(locale), false)) {
                                                                break loop0;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                next = null;
                                                break;
                                            }
                                        }
                                        TakoEasterEggConfig takoEasterEggConfig = next;
                                        if (takoEasterEggConfig != null) {
                                            c1862030yYT.LIZ = (String) ((LinkedHashMap) takoEasterEggConfig.LIZLLL).get("en");
                                            c1862030yYT.LIZIZ = takoEasterEggConfig.LIZIZ;
                                            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
                                            if (takoMixFeedLJIIIZ2 != null) {
                                                str8 = takoMixFeedLJIIIZ2.text;
                                            } else {
                                                str8 = null;
                                            }
                                            Pattern pattern = C1905510zgb.LIZ;
                                            ArrayList arrayList = new ArrayList();
                                            if (str8 != null && str8.length() != 0) {
                                                Matcher matcher = C1905510zgb.LIZ.matcher(str8);
                                                if (matcher.find()) {
                                                    arrayList.add(matcher.group());
                                                }
                                            }
                                            String str11 = (String) C13LP.LJJJLL(arrayList);
                                            if (str11 == null || str11.length() == 0) {
                                                str11 = takoEasterEggConfig.LIZJ;
                                            }
                                            c1862030yYT.LIZJ = str11;
                                            c1862030yYT.LIZLLL = str9;
                                            C1DFH c1dfh = C0PEM.LIZ;
                                            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C844410XAp(c1862030yYT, null), 3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        C844420XAq.LIZJ = this;
    }
}
