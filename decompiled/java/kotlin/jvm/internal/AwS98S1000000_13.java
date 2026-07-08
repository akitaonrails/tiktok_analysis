package kotlin.jvm.internal;

import X.AbstractC848400XPy;
import X.C09AY;
import X.C0VLX;
import X.C0XQ7;
import X.C0XWA;
import X.C1218504pj;
import X.C20653815rs;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C793770VBv;
import X.C805030Vi1;
import X.C805950VjV;
import X.InterfaceC805040Vi2;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AwS98S1000000_13 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return this.s0;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S1000000_13(int i) {
        super(0);
        this.$t = i;
        this.s0 = "js_injection";
    }

    public static final Object invoke$0(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("itemId:");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS98S1000000_13 awS98S1000000_13) {
        C0XWA c0xwa = C0XWA.LIZ;
        String str = awS98S1000000_13.s0;
        synchronized (c0xwa) {
            Set<String> set = C0XWA.LIZJ;
            set.remove(str);
            ((Keva) C0XWA.LIZIZ.getValue()).storeStringSet("refresh_key", set);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS98S1000000_13 awS98S1000000_13) throws IllegalAccessException {
        Object obj;
        String name;
        C805950VjV.LIZIZ();
        Field field = C805950VjV.LIZ;
        Message messageLIZJ = null;
        if (field != null) {
            obj = field.get(C805950VjV.LIZJ);
        } else {
            obj = null;
        }
        if (obj instanceof Message) {
            messageLIZJ = (Message) obj;
        }
        C1218504pj.LIZ();
        while (true) {
            if (messageLIZJ != null) {
                if (messageLIZJ.getTarget() != null) {
                    String str = awS98S1000000_13.s0;
                    Handler target = messageLIZJ.getTarget();
                    if (target != null) {
                        name = target.getClass().getName();
                    } else {
                        name = "";
                    }
                    List list = (List) ((ConcurrentHashMap) C805950VjV.LJFF.getValue()).get(str);
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(name, it2.next())) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("shouldAdvance true, handlerName : ");
                                sbLIZ.append(name);
                                C2188811AlT.LIZIZ(sbLIZ);
                                C1218504pj.LIZ();
                                Handler target2 = messageLIZJ.getTarget();
                                Message messageObtain = Message.obtain(messageLIZJ);
                                if (target2 != null) {
                                    target2.removeMessages(messageLIZJ.what, HandlerHook.getMessageObj(messageLIZJ.obj));
                                    C786410Ut5.LJLJJLL(target2, messageObtain);
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
                messageLIZJ = C805950VjV.LIZJ(messageLIZJ);
            } else {
                C1218504pj.LIZ();
                break;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doPreload: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doPreload: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS98S1000000_13.s0);
        sbLIZ.append("_image_exposure");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$14(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregisterService: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initService: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS98S1000000_13 awS98S1000000_13) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", awS98S1000000_13.s0);
        jSONObject.put("error_info", "prediction job was rejected");
        C793770VBv.LJII("pns_kv_model_metric", jSONObject, null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRelatedTagWithHeroId, aid: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$18(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Uri.parse happen error. url:");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$19(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unregisterService: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS98S1000000_13.s0);
        sbLIZ.append(" download done");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$20(AwS98S1000000_13 awS98S1000000_13) {
        List<C0VLX> listLIZIZ;
        C0VLX c0vlx;
        C805030Vi1.LIZ.getClass();
        InterfaceC805040Vi2 interfaceC805040Vi2LIZ = C805030Vi1.LIZ();
        if (interfaceC805040Vi2LIZ != null && (listLIZIZ = interfaceC805040Vi2LIZ.LIZIZ(awS98S1000000_13.s0, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) != null && !listLIZIZ.isEmpty() && (c0vlx = (C0VLX) ListProtector.get(listLIZIZ, 0)) != null) {
            c0vlx.LIZLLL = 1;
            InterfaceC805040Vi2 interfaceC805040Vi2LIZ2 = C805030Vi1.LIZ();
            if (interfaceC805040Vi2LIZ2 != null) {
                interfaceC805040Vi2LIZ2.LIZLLL(c0vlx);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRealCache hitStateOperator getHitState #");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$22(AwS98S1000000_13 awS98S1000000_13) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRealCache hitStateOperator updateHitState #");
        sbLIZ.append(awS98S1000000_13.s0);
        sbLIZ.append(", hasCacheManager: ");
        C20653815rs.LIZ.getClass();
        if (C20653815rs.LIZIZ() != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$24(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("session: ");
        sbLIZ.append(awS98S1000000_13.s0);
        sbLIZ.append(" launch removed and current session id set null...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$25(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("session: ");
        sbLIZ.append(awS98S1000000_13.s0);
        sbLIZ.append(" terminate removed and current session id set null...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS98S1000000_13.s0);
        sbLIZ.append(" download done");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed to parse url: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed to parse url: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed to parse url: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed to parse url: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed to parse url: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS98S1000000_13 awS98S1000000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("autoDFID: ");
        sbLIZ.append(awS98S1000000_13.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S1000000_13(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
