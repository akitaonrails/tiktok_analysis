package com.ss.android.ugc.aweme.service;

import X.AbstractC538070L8j;
import X.C0CHQ;
import X.C0CIJ;
import X.C0F1S;
import X.C0FQQ;
import X.C0FQS;
import X.C0FQT;
import X.C0L7B;
import X.C0LAB;
import X.C1429050nI7;
import X.C15438062q;
import X.C19719512Dh;
import X.C2188811AlT;
import X.C311170CHr;
import X.C311200CHu;
import X.C358630E4f;
import X.C377880Eri;
import X.C381150Ewz;
import X.C381160Ex0;
import X.C381170Ex1;
import X.C381180Ex2;
import X.C381300ExE;
import X.C381370ExL;
import X.C381400ExO;
import X.C381530Exb;
import X.C5183020f;
import X.C537860L7o;
import X.C538050L8h;
import X.C538080L8k;
import X.C538090L8l;
import X.C538120L8o;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC354490Dv5;
import X.InterfaceC537900L7s;
import X.InterfaceC538100L8m;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.service.TemplateServiceImpl;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.vesdk.VEUserConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS43S0500000_8;
import kotlin.jvm.internal.AwS4S0400100_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateServiceImpl implements ITemplateService {
    public final C538120L8o LIZ = new C538120L8o();
    public final Map<String, C0L7B> LIZIZ = new LinkedHashMap();
    public final Map<String, Pair<C0FQS, InterfaceC538100L8m>> LIZJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final String LIZLLL() throws JSONException {
        TemplateScene next;
        Pair pairLIZJ;
        boolean z = false;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                z = true;
            }
        }
        if (!z) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<TemplateScene> it2 = TemplateScene.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.getSceneName(), "")) {
                break;
            }
        }
        TemplateScene templateScene = next;
        if (templateScene == null) {
            C1429050nI7.LIZ.getClass();
            pairLIZJ = C1429050nI7.LIZ();
        } else {
            C1429050nI7.LIZ.getClass();
            pairLIZJ = C1429050nI7.LIZJ(templateScene);
        }
        jSONObject.put("feature_bits", pairLIZJ.getFirst());
        jSONObject.put("feature_codes", pairLIZJ.getSecond());
        C1429050nI7.LIZ.getClass();
        Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
        jSONObject.put("protocol_version", "2");
        jSONObject.put("effect_sdk_version", C0CHQ.LIZ().LJJJ().getEffectSDKVersion());
        return C786410Ut5.J3(jSONObject);
    }

    @Override // X.InterfaceC354490Dv5
    public final void cancel() {
        Collection collectionValues = ((LinkedHashMap) this.LIZJ).values();
        ArrayList<InterfaceC354490Dv5> arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator it2 = collectionValues.iterator();
        while (true) {
            Object second = null;
            if (!it2.hasNext()) {
                break;
            }
            Pair pair = (Pair) it2.next();
            if (pair != null) {
                second = pair.getSecond();
            }
            arrayList.add(second);
        }
        for (InterfaceC354490Dv5 interfaceC354490Dv5 : arrayList) {
            if (interfaceC354490Dv5 != null) {
                interfaceC354490Dv5.cancel();
            }
        }
        ((LinkedHashMap) this.LIZJ).clear();
        C538120L8o c538120L8o = this.LIZ;
        c538120L8o.LIZ = 0L;
        c538120L8o.LIZIZ = null;
        C381530Exb.LIZ("TemplateNLERestoreOptimize clear: ");
        C381530Exb.LIZ("TemplateServiceImpl: clear");
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final C0L7B LIZ(String str) {
        return (C0L7B) ((LinkedHashMap) this.LIZIZ).get(str);
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final void LJ(C0FQS c0fqs) {
        C538090L8l c538090L8l = new C538090L8l();
        c538090L8l.LIZ(new C381170Ex1());
        c538090L8l.LIZJ().LJIIZILJ(c0fqs);
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final long LJIIIIZZ(NLETemplateModel nLETemplateModel) {
        C538120L8o c538120L8o = this.LIZ;
        if (nLETemplateModel == null) {
            c538120L8o.getClass();
            return 0L;
        }
        c538120L8o.LIZ = 0L;
        c538120L8o.LIZIZ = null;
        C381530Exb.LIZ("TemplateNLERestoreOptimize clear: ");
        c538120L8o.LIZ = System.nanoTime();
        c538120L8o.LIZIZ = nLETemplateModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateNLERestoreOptimize setNLEModel: curId=");
        sbLIZ.append(c538120L8o.LIZ);
        C381530Exb.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return c538120L8o.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final void LJIIL(C0L7B c0l7b) {
        String str = c0l7b.LJII;
        if (str != null) {
            this.LIZIZ.put(str, c0l7b);
        }
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final NLETemplateModel LJJI(Long l) {
        C538120L8o c538120L8o = this.LIZ;
        long j = c538120L8o.LIZ;
        if (j != 0 && l != null && j == l.longValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemplateNLERestoreOptimize getNLEModel: curId=");
            sbLIZ.append(c538120L8o.LIZ);
            sbLIZ.append(", id=");
            sbLIZ.append(l);
            C381530Exb.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return c538120L8o.LIZIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TemplateNLERestoreOptimize getNLEModel: curId not equals id, curId=");
        sbLIZ2.append(c538120L8o.LIZ);
        sbLIZ2.append(", id=");
        sbLIZ2.append(l);
        C381530Exb.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final C0FQS LJJIIJ(String str) {
        Pair pair = (Pair) ((LinkedHashMap) this.LIZJ).get(str);
        if (pair != null) {
            return (C0FQS) pair.getFirst();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final C0FQT LJJIFFI(C0FQS c0fqs, AwS587S0100000_8 awS587S0100000_8, AwS587S0100000_8 awS587S0100000_82) {
        C538090L8l c538090L8l = new C538090L8l();
        c538090L8l.LIZ(new C537860L7o());
        c538090L8l.LIZ.LJIIIZ = new AwS587S0100000_8(awS587S0100000_8, 631);
        c538090L8l.LIZ.LJIIJ = new AwS587S0100000_8(awS587S0100000_82, 632);
        c538090L8l.LIZ.LJIIJJI = new C5183020f(200);
        C0FQT c0fqtLIZJ = c538090L8l.LIZJ();
        c0fqtLIZJ.LJIJJ();
        c0fqtLIZJ.LJIIZILJ(c0fqs);
        String str = c0fqs.LJ;
        if (str == null) {
            return c0fqtLIZJ;
        }
        this.LIZJ.put(str, new Pair<>(c0fqs, c0fqtLIZJ));
        return c0fqtLIZJ;
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final C0FQT LJFF(final C0FQS c0fqs, Function1 function1, Function1 function12, Function1 function13) {
        C0FQT c0fqtLIZJ;
        c0fqs.LJIJJLI.add(new InterfaceC537900L7s() { // from class: X.0FQN
            public final Map<String, Long> LIZ = new LinkedHashMap();
            public final Set<String> LIZIZ = C093Y.LJ("COMBINE_EFFECT");

            @Override // X.InterfaceC537900L7s
            public final void LJ(C00DI c00di) {
            }

            public static final long LJFF(long j) {
                if (j < 0) {
                    return -1L;
                }
                return System.currentTimeMillis() - j;
            }

            @Override // X.InterfaceC537900L7s
            public final void LIZJ(String str) {
                if (this.LIZIZ.contains(str)) {
                    this.LIZ.put(str, Long.valueOf(System.currentTimeMillis()));
                }
            }

            @Override // X.InterfaceC537900L7s
            public final void LIZLLL(String str) {
                long jLongValue;
                if (this.LIZIZ.contains(str)) {
                    C0FQS c0fqs2 = c0fqs;
                    String str2 = c0fqs2.LJ;
                    Integer num = c0fqs2.LJII;
                    Long l = (Long) ((LinkedHashMap) this.LIZ).get(str);
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    long jLJFF = LJFF(jLongValue);
                    C0FQS c0fqs3 = c0fqs;
                    List<String> list = c0fqs3.LJIILLIIL;
                    List<String> list2 = c0fqs3.LJIIZILJ;
                    int value = C0FQO.CANCELED.getValue();
                    C0FQS c0fqs4 = c0fqs;
                    C0FQQ.LIZIZ(str, str2, num, jLJFF, list, list2, null, value, 0, null, 0, c0fqs4.LIZJ, c0fqs4.LJJIII);
                }
            }

            @Override // X.InterfaceC537900L7s
            public final void LIZ(String str, C381330ExH c381330ExH) {
                String str2;
                long jLongValue;
                Map<String, String> map;
                if (this.LIZIZ.contains(str)) {
                    Map<String, String> map2 = null;
                    if (c381330ExH != null && (map = c381330ExH.LIZIZ) != null) {
                        str2 = map.get("skipped");
                    } else {
                        str2 = null;
                    }
                    if (!Intrinsics.LJFF(str2, "true")) {
                        C0FQS c0fqs2 = c0fqs;
                        String str3 = c0fqs2.LJ;
                        Integer num = c0fqs2.LJII;
                        Long l = (Long) ((LinkedHashMap) this.LIZ).get(str);
                        long jLongValue2 = 0;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        long jLJFF = LJFF(jLongValue);
                        C0FQS c0fqs3 = c0fqs;
                        List<String> list = c0fqs3.LJIILLIIL;
                        List<String> list2 = c0fqs3.LJIIZILJ;
                        if (c381330ExH != null) {
                            map2 = c381330ExH.LIZIZ;
                        }
                        int value = C0FQO.SUCCESS.getValue();
                        C0FQS c0fqs4 = c0fqs;
                        C0FQQ.LIZIZ(str, str3, num, jLJFF, list, list2, map2, value, 0, null, c0fqs4.LJJIFFI, c0fqs4.LIZJ, c0fqs4.LJJIII);
                        List<C0FQP> list3 = c0fqs.LJJI;
                        ArrayList<C0FQP> arrayList = new ArrayList();
                        for (Object obj : (ArrayList) list3) {
                            C0FQP c0fqp = (C0FQP) obj;
                            if (c0fqp.LIZJ != -1 && C123100dR.LIZ(c0fqp.LIZ)) {
                                arrayList.add(obj);
                            }
                        }
                        C0FQS c0fqs5 = c0fqs;
                        for (C0FQP c0fqp2 : arrayList) {
                            C0FQQ.LIZLLL(str, c0fqs5.LJ, c0fqs5.LJII, c0fqs5.LJIIIIZZ, c0fqp2.LIZIZ, c0fqp2.LIZ, c0fqp2.LIZJ, c0fqp2.LIZLLL, c0fqp2.LJ, c0fqs5.LIZJ, c0fqp2.LJFF);
                        }
                        TemplateServiceImpl templateServiceImpl = this;
                        C0FQS c0fqs6 = c0fqs;
                        String str4 = c0fqs6.LJ;
                        Integer num2 = c0fqs6.LJII;
                        String str5 = c0fqs6.LJI;
                        String str6 = c0fqs6.LJIIL;
                        Long l2 = (Long) ((LinkedHashMap) this.LIZ).get(str);
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                        }
                        long jLJFF2 = LJFF(jLongValue2);
                        boolean z = c0fqs.LJJIIJZLJL;
                        templateServiceImpl.getClass();
                        TemplateServiceImpl.LJJIIJZLJL(str, str4, num2, str5, str6, jLJFF2, true, 0, null, z);
                    }
                }
            }

            @Override // X.InterfaceC537900L7s
            public final void LIZIZ(String str, C381350ExJ c381350ExJ) {
                long jLongValue;
                Map<String, String> map;
                int i;
                String str2;
                if (this.LIZIZ.contains(str)) {
                    C0FQS c0fqs2 = c0fqs;
                    String str3 = c0fqs2.LJ;
                    Integer num = c0fqs2.LJII;
                    Long l = (Long) ((LinkedHashMap) this.LIZ).get(str);
                    long jLongValue2 = 0;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    long jLJFF = LJFF(jLongValue);
                    C0FQS c0fqs3 = c0fqs;
                    List<String> list = c0fqs3.LJIILLIIL;
                    List<String> list2 = c0fqs3.LJIIZILJ;
                    String str4 = null;
                    if (c381350ExJ != null) {
                        map = c381350ExJ.LIZJ;
                    } else {
                        map = null;
                    }
                    int value = C0FQO.FAILED.getValue();
                    int i2 = 0;
                    if (c381350ExJ != null) {
                        i = c381350ExJ.LIZ;
                        str2 = c381350ExJ.LIZIZ;
                    } else {
                        i = 0;
                        str2 = null;
                    }
                    C0FQS c0fqs4 = c0fqs;
                    C0FQQ.LIZIZ(str, str3, num, jLJFF, list, list2, map, value, i, str2, c0fqs4.LJJIFFI, c0fqs4.LIZJ, c0fqs4.LJJIII);
                    List<C0FQP> list3 = c0fqs.LJJI;
                    ArrayList<C0FQP> arrayList = new ArrayList();
                    for (Object obj : (ArrayList) list3) {
                        C0FQP c0fqp = (C0FQP) obj;
                        if (c0fqp.LIZJ != -1 && C123100dR.LIZ(c0fqp.LIZ)) {
                            arrayList.add(obj);
                        }
                    }
                    C0FQS c0fqs5 = c0fqs;
                    for (C0FQP c0fqp2 : arrayList) {
                        C0FQQ.LIZLLL(str, c0fqs5.LJ, c0fqs5.LJII, c0fqs5.LJIIIIZZ, c0fqp2.LIZIZ, c0fqp2.LIZ, c0fqp2.LIZJ, c0fqp2.LIZLLL, c0fqp2.LJ, c0fqs5.LIZJ, c0fqp2.LJFF);
                    }
                    TemplateServiceImpl templateServiceImpl = this;
                    C0FQS c0fqs6 = c0fqs;
                    String str5 = c0fqs6.LJ;
                    Integer num2 = c0fqs6.LJII;
                    String str6 = c0fqs6.LJI;
                    String str7 = c0fqs6.LJIIL;
                    Long l2 = (Long) ((LinkedHashMap) this.LIZ).get(str);
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    }
                    long jLJFF2 = LJFF(jLongValue2);
                    if (c381350ExJ != null) {
                        i2 = c381350ExJ.LIZ;
                        str4 = c381350ExJ.LIZIZ;
                    }
                    boolean z = c0fqs.LJJIIJZLJL;
                    templateServiceImpl.getClass();
                    TemplateServiceImpl.LJJIIJZLJL(str, str5, num2, str6, str7, jLJFF2, false, i2, str4, z);
                }
            }
        });
        if (C381400ExO.LIZ() == 0) {
            C538090L8l c538090L8l = new C538090L8l();
            c538090L8l.LIZ(new C381300ExE(false));
            c538090L8l.LIZ.LJIIIZ = new AwS587S0100000_8(function1, 620);
            c538090L8l.LIZ.LJIIJ = new AwS587S0100000_8(function12, 621);
            c538090L8l.LIZ.LJIIJJI = new C5183020f(function13, (Function1<? super Long, Object>) 198);
            c0fqtLIZJ = c538090L8l.LIZJ();
        } else {
            C538090L8l c538090L8l2 = new C538090L8l();
            c538090L8l2.LIZ(new C381370ExL());
            c538090L8l2.LIZ.LJIIIZ = new AwS587S0100000_8(function1, 622);
            c538090L8l2.LIZ.LJIIJ = new AwS587S0100000_8(function12, 623);
            c538090L8l2.LIZ.LJIIJJI = new C5183020f(function13, (Function1<? super Long, Object>) 199);
            c0fqtLIZJ = c538090L8l2.LIZJ();
        }
        c0fqtLIZJ.LJIIZILJ(c0fqs);
        return c0fqtLIZJ;
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final C0FQT LJIILL(C0FQS c0fqs, Function1 function1, Function1 function12, Function1 function13) {
        C538090L8l c538090L8l = new C538090L8l();
        c538090L8l.LIZIZ(new AbstractC538070L8j() { // from class: X.0Exf
            @Override // X.InterfaceC538100L8m
            public final String getTaskName() {
                return "UGCTask_Matting";
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [T, com.bytedance.ies.nle.editor_jni.NLETemplateModel] */
            @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
            public final boolean LJIIZILJ(C0FQS c0fqs2) {
                if (!super.LJIIZILJ(c0fqs2)) {
                    return false;
                }
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = c0fqs2.LJIIJ;
                C013C c013c = new C013C();
                T t = c259800zU.element;
                if (t != 0) {
                    C348740Dlo.LIZIZ((NLEModel) t, new AwS619S0100000_5(c013c, 64));
                }
                if (c0fqs2.LIZIZ != null && c259800zU.element != 0 && c013c.element) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C381560Exe(c0fqs2, c259800zU, this, null), 2);
                    return false;
                }
                C354270Duj.LIZJ(0L, new AwS406S0200000_5(this, c0fqs2, 149));
                return false;
            }
        });
        c538090L8l.LIZ.LJIIIZ = new AwS587S0100000_8(function1, 618);
        c538090L8l.LIZ.LJIIJ = new AwS587S0100000_8(function12, 619);
        c538090L8l.LIZ.LJIIJJI = new C5183020f(function13, (Function1<? super Long, Object>) 197);
        C0FQT c0fqtLIZJ = c538090L8l.LIZJ();
        c0fqtLIZJ.LJIIZILJ(c0fqs);
        return c0fqtLIZJ;
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final C0FQT LJIJI(C0FQS c0fqs, AwS43S0500000_8 awS43S0500000_8, AwS374S0200000_8 awS374S0200000_8, AwS587S0100000_8 awS587S0100000_8) {
        InterfaceC538100L8m interfaceC538100L8m;
        Pair pair = (Pair) ((LinkedHashMap) this.LIZJ).get(c0fqs.LJ);
        if (pair != null) {
            interfaceC538100L8m = (InterfaceC538100L8m) pair.getSecond();
        } else {
            interfaceC538100L8m = null;
        }
        C538090L8l c538090L8l = new C538090L8l();
        c538090L8l.LIZ(new C538050L8h());
        if (interfaceC538100L8m != null && interfaceC538100L8m.LJIIJJI()) {
            c538090L8l.LIZIZ.LJIJJLI(interfaceC538100L8m);
            C538080L8k c538080L8kLJIILLIIL = interfaceC538100L8m.LJIILLIIL();
            if (c538080L8kLJIILLIIL != null) {
                c538090L8l.LIZJ = c538080L8kLJIILLIIL;
                C538080L8k c538080L8k = c538090L8l.LIZ;
                c538080L8kLJIILLIIL.LIZJ = c538080L8k;
                c538080L8kLJIILLIIL.LJIJJLI(c538080L8k);
            }
        } else {
            Map<String, Pair<C0FQS, InterfaceC538100L8m>> map = this.LIZJ;
            C19719512Dh.LIZJ(map).remove(c0fqs.LJ);
            c538090L8l.LIZ(new C537860L7o());
        }
        c538090L8l.LIZ.LJIIIZ = new AwS587S0100000_8(awS43S0500000_8, 628);
        c538090L8l.LIZ.LJIIJ = new AwS587S0100000_8(awS374S0200000_8, 629);
        c538090L8l.LIZ.LJIIJJI = new AwS587S0100000_8(awS587S0100000_8, 630);
        C0FQT c0fqtLIZJ = c538090L8l.LIZJ();
        c0fqtLIZJ.LJIIZILJ(c0fqs);
        return c0fqtLIZJ;
    }

    @Override // com.ss.android.ugc.aweme.api.ITemplateService
    public final C0FQT LJJ(final C0FQS c0fqs, AwS4S0400100_5 awS4S0400100_5, AwS214S0300000_5 awS214S0300000_5, AwS371S0200000_5 awS371S0200000_5) {
        C0FQT c0fqtLIZJ;
        String str;
        c0fqs.LJIJJLI.add(new InterfaceC537900L7s() { // from class: X.0FQM
            public final Map<String, Long> LIZ = new LinkedHashMap();
            public final Set<String> LIZIZ = C093Y.LJ("COMBINE_EFFECT", "I2V_PRE", "TEMPLATE_FL2V", "TRANSITION_FRAME_PRE", "TEMPLATE_I2I");

            @Override // X.InterfaceC537900L7s
            public final void LJ(C00DI c00di) {
            }

            public static final long LJFF(long j) {
                if (j < 0) {
                    return -1L;
                }
                return System.currentTimeMillis() - j;
            }

            @Override // X.InterfaceC537900L7s
            public final void LIZJ(String str2) {
                if (this.LIZIZ.contains(str2)) {
                    this.LIZ.put(str2, Long.valueOf(System.currentTimeMillis()));
                }
            }

            @Override // X.InterfaceC537900L7s
            public final void LIZLLL(String str2) {
                long jLongValue;
                if (this.LIZIZ.contains(str2)) {
                    C0FQS c0fqs2 = c0fqs;
                    String str3 = c0fqs2.LJ;
                    Integer num = c0fqs2.LJII;
                    Long l = (Long) ((LinkedHashMap) this.LIZ).get(str2);
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    long jLJFF = LJFF(jLongValue);
                    C0FQS c0fqs3 = c0fqs;
                    C0FQQ.LIZIZ(str2, str3, num, jLJFF, c0fqs3.LJIILLIIL, c0fqs3.LJIIZILJ, null, C0FQO.CANCELED.getValue(), 0, null, 0, c0fqs.LIZJ, 0);
                }
            }

            @Override // X.InterfaceC537900L7s
            public final void LIZ(String str2, C381330ExH c381330ExH) {
                String str3;
                long jLongValue;
                Map<String, String> map;
                if (this.LIZIZ.contains(str2)) {
                    Map<String, String> map2 = null;
                    if (c381330ExH != null && (map = c381330ExH.LIZIZ) != null) {
                        str3 = map.get("skipped");
                    } else {
                        str3 = null;
                    }
                    if (!Intrinsics.LJFF(str3, "true")) {
                        C0FQS c0fqs2 = c0fqs;
                        String str4 = c0fqs2.LJ;
                        Integer num = c0fqs2.LJII;
                        Long l = (Long) ((LinkedHashMap) this.LIZ).get(str2);
                        long jLongValue2 = 0;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        long jLJFF = LJFF(jLongValue);
                        C0FQS c0fqs3 = c0fqs;
                        List<String> list = c0fqs3.LJIILLIIL;
                        List<String> list2 = c0fqs3.LJIIZILJ;
                        if (c381330ExH != null) {
                            map2 = c381330ExH.LIZIZ;
                        }
                        C0FQQ.LIZIZ(str2, str4, num, jLJFF, list, list2, map2, C0FQO.SUCCESS.getValue(), 0, null, 0, c0fqs.LIZJ, 0);
                        TemplateServiceImpl templateServiceImpl = this;
                        C0FQS c0fqs4 = c0fqs;
                        String str5 = c0fqs4.LJ;
                        Integer num2 = c0fqs4.LJII;
                        String str6 = c0fqs4.LJI;
                        String str7 = c0fqs4.LJIIL;
                        Long l2 = (Long) ((LinkedHashMap) this.LIZ).get(str2);
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                        }
                        long jLJFF2 = LJFF(jLongValue2);
                        boolean z = c0fqs.LJJIIJZLJL;
                        templateServiceImpl.getClass();
                        TemplateServiceImpl.LJJIIJZLJL(str2, str5, num2, str6, str7, jLJFF2, true, 0, null, z);
                    }
                }
            }

            @Override // X.InterfaceC537900L7s
            public final void LIZIZ(String str2, C381350ExJ c381350ExJ) {
                long jLongValue;
                Map<String, String> map;
                int i;
                String str3;
                if (this.LIZIZ.contains(str2)) {
                    C0FQS c0fqs2 = c0fqs;
                    String str4 = c0fqs2.LJ;
                    Integer num = c0fqs2.LJII;
                    Long l = (Long) ((LinkedHashMap) this.LIZ).get(str2);
                    long jLongValue2 = 0;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    long jLJFF = LJFF(jLongValue);
                    C0FQS c0fqs3 = c0fqs;
                    List<String> list = c0fqs3.LJIILLIIL;
                    List<String> list2 = c0fqs3.LJIIZILJ;
                    String str5 = null;
                    if (c381350ExJ != null) {
                        map = c381350ExJ.LIZJ;
                    } else {
                        map = null;
                    }
                    int value = C0FQO.FAILED.getValue();
                    int i2 = 0;
                    if (c381350ExJ != null) {
                        i = c381350ExJ.LIZ;
                        str3 = c381350ExJ.LIZIZ;
                    } else {
                        i = 0;
                        str3 = null;
                    }
                    C0FQQ.LIZIZ(str2, str4, num, jLJFF, list, list2, map, value, i, str3, 0, c0fqs.LIZJ, 0);
                    TemplateServiceImpl templateServiceImpl = this;
                    C0FQS c0fqs4 = c0fqs;
                    String str6 = c0fqs4.LJ;
                    Integer num2 = c0fqs4.LJII;
                    String str7 = c0fqs4.LJI;
                    String str8 = c0fqs4.LJIIL;
                    Long l2 = (Long) ((LinkedHashMap) this.LIZ).get(str2);
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    }
                    long jLJFF2 = LJFF(jLongValue2);
                    if (c381350ExJ != null) {
                        i2 = c381350ExJ.LIZ;
                        str5 = c381350ExJ.LIZIZ;
                    }
                    boolean z = c0fqs.LJJIIJZLJL;
                    templateServiceImpl.getClass();
                    TemplateServiceImpl.LJJIIJZLJL(str2, str6, num2, str7, str8, jLJFF2, false, i2, str5, z);
                }
            }
        });
        if (C358630E4f.LIZ()) {
            C538090L8l c538090L8l = new C538090L8l();
            c538090L8l.LIZ(new AbstractC538070L8j() { // from class: X.0Lv9
                @Override // X.InterfaceC538100L8m
                public final String getTaskName() {
                    return "INIT_VE";
                }

                @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
                public final boolean LJIIZILJ(C0FQS c0fqs2) {
                    boolean z;
                    boolean z2;
                    List<String> list;
                    INLEMediaSession iNLEMediaSession;
                    INLEMediaRuntime mediaRuntimeApi;
                    List<String> list2;
                    Set<Integer> setLIZIZ;
                    if (!super.LJIIZILJ(c0fqs2)) {
                        return false;
                    }
                    NLETemplateModel nLETemplateModel = c0fqs2.LJIIJ;
                    if (nLETemplateModel == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("INIT_VE");
                        sbLIZ.append(": NLETemplateModel is NULL");
                        LJJIIZ(new C381350ExJ(10001, C2188811AlT.LIZIZ(sbLIZ), 4));
                        return false;
                    }
                    C0F1S c0f1s = c0fqs2.LIZIZ;
                    if (c0f1s != null && c0f1s.LIZ.length() > 0) {
                        NLETemplateModel nLETemplateModel2 = c0fqs2.LJIIJ;
                        if (nLETemplateModel2 != null && (setLIZIZ = C0FPT.LIZIZ(nLETemplateModel2)) != null && setLIZIZ.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue()))) {
                            LIZJ(c0fqs2, null);
                            return false;
                        }
                        List<String> list3 = c0fqs2.LJIIIZ;
                        if (list3 != null && list3.contains("UGC_MAGIC_V2")) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && (list2 = c0fqs2.LJIIIZ) != null && !list2.contains("UGC_ASYNC_I2V")) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
                        if (tracks != null) {
                            ArrayList<NLETrackSlot> arrayList = new ArrayList();
                            Iterator<NLETrack> it2 = tracks.iterator();
                            while (it2.hasNext()) {
                                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
                            }
                            for (NLETrackSlot nLETrackSlot : arrayList) {
                                if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null && !nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V")) {
                                    C354260Dui.LIZ.getClass();
                                    NLEVideoEffect nLEVideoEffectLJFF = C354260Dui.LJFF(nLETrackSlot);
                                    if (nLEVideoEffectLJFF != null && (!z2 || !C358630E4f.LIZ())) {
                                        ((ArrayList) c0fqs2.LJIILLIIL).add(nLETrackSlot.getExtra("ep_magic_resource_id"));
                                        c0fqs2.LJIL.add(new C381340ExI(nLETrackSlot, nLEVideoEffectLJFF));
                                    }
                                }
                            }
                        }
                        if (((!c0fqs2.LJIL.isEmpty()) && (!C358630E4f.LIZ() || !z2)) || ((list = c0fqs2.LJIIIZ) != null && list.contains("UGC_ASYNC_I2V"))) {
                            o.LJFF(C2216131BoR.LIZ());
                            VEUserConfig vEUserConfig = new VEUserConfig();
                            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_UseNewEngineEffectOpt, Integer.valueOf(EnumC558380LvA.EFFECT_NEW_OLD_ENGINE_COEXIST.mode)));
                            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_LoadImageOptimize, Boolean.TRUE));
                            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_GlobalEffectMode, 2));
                            C1463670oBx c1463670oBxLIZ = new C1452950nuf().LIZ(new SurfaceView(C0CHQ.LIZ), new C1452970nuh(C00CM.NLEEditorType, C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C0F1Q.LIZ(c0fqs2.LIZIZ), EnumC20228214Cy.VE_PREVIEW_WORKSPACE, null, false, 12), -1L, vEUserConfig, true, EnumC1441790ncf.UGC_TEMPLATE.getValue(), ((Boolean) C0AY7.LIZ.getValue()).booleanValue(), EnumC1441860ncm.UPLOAD_OTHER.getValue(), 3072));
                            c1463670oBxLIZ.yc(NLETemplateModel.saveToDraft(nLETemplateModel));
                            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(c1463670oBxLIZ);
                            if (c348100DkmLIZIZ != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null) {
                                mediaRuntimeApi.cancelPreprocessI2V();
                            }
                            c1463670oBxLIZ.prepare();
                            C391360FWc.LIZLLL("", c1463670oBxLIZ, new AwS584S0100000_5(c0fqs2, 1105));
                        }
                        LIZJ(c0fqs2, null);
                        return false;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("INIT_VE");
                    sbLIZ2.append(": ");
                    sbLIZ2.append(c0fqs2.LIZIZ);
                    LJJIIZ(new C381350ExJ(10001, C2188811AlT.LIZIZ(sbLIZ2), 4));
                    return false;
                }
            });
            c538090L8l.LIZIZ(new C381160Ex0());
            c538090L8l.LIZIZ(new C381180Ex2());
            c538090L8l.LIZIZ(new C381150Ewz());
            c538090L8l.LIZIZ(new C381170Ex1());
            c538090L8l.LIZIZ(new AbstractC538070L8j(c0fqs) { // from class: X.0F1W
                public final C0FQS LJII;

                @Override // X.InterfaceC538100L8m
                public final String getTaskName() {
                    return "RELEASE_VE";
                }

                public final void LJJIJ() {
                    INLEMediaSession iNLEMediaSession;
                    C381530Exb.LIZIZ(this, "releaseNLE");
                    C381410ExP c381410ExP = this.LJII.LJIJ;
                    if (c381410ExP == null || (iNLEMediaSession = c381410ExP.LIZ) == null) {
                        return;
                    }
                    synchronized (iNLEMediaSession) {
                        try {
                            iNLEMediaSession.getMediaRuntimeApi().cancelPreprocessI2V();
                            iNLEMediaSession.getEffectApi().removeEffectMessageCenterCallback();
                            iNLEMediaSession.getPlayerApi().destroy();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
                public final void LJJIII() {
                    super.LJJIII();
                    LJJIJ();
                }

                @Override // X.AbstractC538070L8j, X.InterfaceC354490Dv5
                public final void cancel() {
                    super.cancel();
                    LJJIJ();
                }

                {
                    this.LJII = c0fqs;
                }

                @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
                public final boolean LJIIZILJ(C0FQS c0fqs2) {
                    if (!super.LJIIZILJ(c0fqs2)) {
                        return false;
                    }
                    LJJIJ();
                    LIZJ(c0fqs2, null);
                    return false;
                }
            });
            c538090L8l.LIZ.LJIIIZ = new AwS587S0100000_8(awS4S0400100_5, 624);
            c538090L8l.LIZ.LJIIJ = new AwS587S0100000_8(awS214S0300000_5, 625);
            c538090L8l.LIZ.LJIIJJI = new AwS584S0100000_5(awS371S0200000_5, 949);
            c0fqtLIZJ = c538090L8l.LIZJ();
        } else {
            C538090L8l c538090L8l2 = new C538090L8l();
            c538090L8l2.LIZ(new AbstractC538070L8j() { // from class: X.0Lv9
                @Override // X.InterfaceC538100L8m
                public final String getTaskName() {
                    return "INIT_VE";
                }

                @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
                public final boolean LJIIZILJ(C0FQS c0fqs2) {
                    boolean z;
                    boolean z2;
                    List<String> list;
                    INLEMediaSession iNLEMediaSession;
                    INLEMediaRuntime mediaRuntimeApi;
                    List<String> list2;
                    Set<Integer> setLIZIZ;
                    if (!super.LJIIZILJ(c0fqs2)) {
                        return false;
                    }
                    NLETemplateModel nLETemplateModel = c0fqs2.LJIIJ;
                    if (nLETemplateModel == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("INIT_VE");
                        sbLIZ.append(": NLETemplateModel is NULL");
                        LJJIIZ(new C381350ExJ(10001, C2188811AlT.LIZIZ(sbLIZ), 4));
                        return false;
                    }
                    C0F1S c0f1s = c0fqs2.LIZIZ;
                    if (c0f1s != null && c0f1s.LIZ.length() > 0) {
                        NLETemplateModel nLETemplateModel2 = c0fqs2.LJIIJ;
                        if (nLETemplateModel2 != null && (setLIZIZ = C0FPT.LIZIZ(nLETemplateModel2)) != null && setLIZIZ.contains(Integer.valueOf(C0CIJ.UGC_I2V_FRAME.getValue()))) {
                            LIZJ(c0fqs2, null);
                            return false;
                        }
                        List<String> list3 = c0fqs2.LJIIIZ;
                        if (list3 != null && list3.contains("UGC_MAGIC_V2")) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && (list2 = c0fqs2.LJIIIZ) != null && !list2.contains("UGC_ASYNC_I2V")) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
                        if (tracks != null) {
                            ArrayList<NLETrackSlot> arrayList = new ArrayList();
                            Iterator<NLETrack> it2 = tracks.iterator();
                            while (it2.hasNext()) {
                                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
                            }
                            for (NLETrackSlot nLETrackSlot : arrayList) {
                                if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null && !nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V")) {
                                    C354260Dui.LIZ.getClass();
                                    NLEVideoEffect nLEVideoEffectLJFF = C354260Dui.LJFF(nLETrackSlot);
                                    if (nLEVideoEffectLJFF != null && (!z2 || !C358630E4f.LIZ())) {
                                        ((ArrayList) c0fqs2.LJIILLIIL).add(nLETrackSlot.getExtra("ep_magic_resource_id"));
                                        c0fqs2.LJIL.add(new C381340ExI(nLETrackSlot, nLEVideoEffectLJFF));
                                    }
                                }
                            }
                        }
                        if (((!c0fqs2.LJIL.isEmpty()) && (!C358630E4f.LIZ() || !z2)) || ((list = c0fqs2.LJIIIZ) != null && list.contains("UGC_ASYNC_I2V"))) {
                            o.LJFF(C2216131BoR.LIZ());
                            VEUserConfig vEUserConfig = new VEUserConfig();
                            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_UseNewEngineEffectOpt, Integer.valueOf(EnumC558380LvA.EFFECT_NEW_OLD_ENGINE_COEXIST.mode)));
                            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_LoadImageOptimize, Boolean.TRUE));
                            vEUserConfig.addConfig(new VEUserConfig.VEUserConfigItem<>(EnumC1463710oC1.ConfigID_GlobalEffectMode, 2));
                            C1463670oBx c1463670oBxLIZ = new C1452950nuf().LIZ(new SurfaceView(C0CHQ.LIZ), new C1452970nuh(C00CM.NLEEditorType, C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), C0F1Q.LIZ(c0fqs2.LIZIZ), EnumC20228214Cy.VE_PREVIEW_WORKSPACE, null, false, 12), -1L, vEUserConfig, true, EnumC1441790ncf.UGC_TEMPLATE.getValue(), ((Boolean) C0AY7.LIZ.getValue()).booleanValue(), EnumC1441860ncm.UPLOAD_OTHER.getValue(), 3072));
                            c1463670oBxLIZ.yc(NLETemplateModel.saveToDraft(nLETemplateModel));
                            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(c1463670oBxLIZ);
                            if (c348100DkmLIZIZ != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null) {
                                mediaRuntimeApi.cancelPreprocessI2V();
                            }
                            c1463670oBxLIZ.prepare();
                            C391360FWc.LIZLLL("", c1463670oBxLIZ, new AwS584S0100000_5(c0fqs2, 1105));
                        }
                        LIZJ(c0fqs2, null);
                        return false;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("INIT_VE");
                    sbLIZ2.append(": ");
                    sbLIZ2.append(c0fqs2.LIZIZ);
                    LJJIIZ(new C381350ExJ(10001, C2188811AlT.LIZIZ(sbLIZ2), 4));
                    return false;
                }
            });
            c538090L8l2.LIZIZ(new C381160Ex0());
            c538090L8l2.LIZIZ(new C381180Ex2());
            c538090L8l2.LIZIZ(new C381150Ewz());
            c538090L8l2.LIZIZ(new C381170Ex1());
            c538090L8l2.LIZIZ(new C381300ExE(true));
            c538090L8l2.LIZIZ(new AbstractC538070L8j(c0fqs) { // from class: X.0F1W
                public final C0FQS LJII;

                @Override // X.InterfaceC538100L8m
                public final String getTaskName() {
                    return "RELEASE_VE";
                }

                public final void LJJIJ() {
                    INLEMediaSession iNLEMediaSession;
                    C381530Exb.LIZIZ(this, "releaseNLE");
                    C381410ExP c381410ExP = this.LJII.LJIJ;
                    if (c381410ExP == null || (iNLEMediaSession = c381410ExP.LIZ) == null) {
                        return;
                    }
                    synchronized (iNLEMediaSession) {
                        try {
                            iNLEMediaSession.getMediaRuntimeApi().cancelPreprocessI2V();
                            iNLEMediaSession.getEffectApi().removeEffectMessageCenterCallback();
                            iNLEMediaSession.getPlayerApi().destroy();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
                public final void LJJIII() {
                    super.LJJIII();
                    LJJIJ();
                }

                @Override // X.AbstractC538070L8j, X.InterfaceC354490Dv5
                public final void cancel() {
                    super.cancel();
                    LJJIJ();
                }

                {
                    this.LJII = c0fqs;
                }

                @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
                public final boolean LJIIZILJ(C0FQS c0fqs2) {
                    if (!super.LJIIZILJ(c0fqs2)) {
                        return false;
                    }
                    LJJIJ();
                    LIZJ(c0fqs2, null);
                    return false;
                }
            });
            c538090L8l2.LIZ.LJIIIZ = new AwS587S0100000_8(awS4S0400100_5, 626);
            c538090L8l2.LIZ.LJIIJ = new AwS587S0100000_8(awS214S0300000_5, 627);
            c538090L8l2.LIZ.LJIIJJI = new AwS584S0100000_5(awS371S0200000_5, 950);
            c0fqtLIZJ = c538090L8l2.LIZJ();
        }
        c0fqtLIZJ.LJIIZILJ(c0fqs);
        C0FQQ.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        C0F1S c0f1s = c0fqs.LIZIZ;
        if (c0f1s != null) {
            str = c0f1s.LIZ;
        } else {
            str = null;
        }
        c0lab.LJ("creation_id", str);
        c0lab.LJ("tt_template_id", c0fqs.LJ);
        c0lab.LJ("shoot_way", c0fqs.LIZJ);
        C377880Eri.LIZ(c0lab, c0fqs.LJIIJ);
        C0FQQ.LIZ("ai_create_template_click", c0lab.LIZ);
        return c0fqtLIZJ;
    }

    public static void LJJIIJZLJL(String str, String str2, Integer num, String str3, String str4, long j, boolean z, int i, String str5, boolean z2) {
        String str6 = str;
        String str7 = str4;
        if (Intrinsics.LJFF("COMBINE_EFFECT", str6)) {
            str6 = "task_magic_v2";
        }
        ITemplateMobService iTemplateMobService = (ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class);
        if (str7 == null) {
            str7 = "";
        }
        iTemplateMobService.LJ(str2, num, str3, str7, str6, j, z, i, false, str5, null, null, null, null, z2, new LinkedHashMap());
    }
}
