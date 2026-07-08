package kotlin.jvm.internal;

import X.C09AY;
import X.C0GTR;
import X.C1295090jo3;
import X.C1302410jzr;
import X.C1306880k74;
import X.C1306940k7A;
import X.C1307030k7J;
import X.C1308940kAO;
import X.C1316950kNJ;
import X.C1328130kfL;
import X.C1331090kk7;
import X.C1331670kl3;
import X.C1335180kqi;
import X.C1335190kqj;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C20622315mn;
import X.C2341109Fh;
import X.C286650BLj;
import X.C417270GXt;
import X.C418440Gaw;
import X.C5180020c;
import X.C814420VxA;
import X.EnumC1306750k6r;
import X.EnumC714850S2h;
import X.InterfaceC1320380kSq;
import X.InterfaceC1331800klG;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.graphics.PointF;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.starship.StarshipBridge;
import com.bytedance.android.starship.strategy.DecisionConfig;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.DeploymentModel;
import com.bytedance.geckox.model.DeploymentModelV4;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AFwS258S0000000_20 extends C09AY implements Function1 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(29);
    public final int $t;

    public static AFwS258S0000000_20 get$arr$(int i) {
        AFwS258S0000000_20 aFwS258S0000000_20 = (AFwS258S0000000_20) arr$.get(i);
        if (aFwS258S0000000_20 != null) {
            return aFwS258S0000000_20;
        }
        arr$.compareAndSet(i, null, new AFwS258S0000000_20(i));
        return (AFwS258S0000000_20) arr$.get(i);
    }

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
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS258S0000000_20(int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        obj.getClass();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        FrameLayout.LayoutParams layoutParams;
        C0GTR c0gtr = new C0GTR((Context) obj, null, 6);
        if (C20622315mn.LIZJ()) {
            layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        } else {
            layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)));
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gtr);
        c0gtr.setLayoutParams(layoutParams);
        c0gtr.setRingWidth(C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
        return c0gtr;
    }

    public static final Object invoke$10(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("Timer completed");
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        ((C1308940kAO) obj).LIZIZ = true;
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$12(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$13(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$14(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$15(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        boolean z = true;
        if (((C1302410jzr) obj).LLILLJJLI != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$17(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        boolean z = true;
        if (((C1302410jzr) obj).LLILLJJLI != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$18(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        C1331090kk7 c1331090kk7 = (C1331090kk7) obj;
        c1331090kk7.LJIIL = InterfaceC1320380kSq.LJII;
        c1331090kk7.LJIILIIL = new PointF(0.5f, 0.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        C1331670kl3 c1331670kl3 = (C1331670kl3) obj;
        if (C1335180kqi.LIZLLL()) {
            c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3.LJJJJJ = "explore_feed_image_cache";
        } else if (C1335190kqj.LIZJ()) {
            c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3.LJJJJJ = "photomode_image_cache_v2";
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return new C417270GXt((Context) obj, null, 6);
    }

    public static final Object invoke$20(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        DeploymentModel deploymentModel;
        String strLJJLIIIJ;
        Map.Entry entry = (Map.Entry) obj;
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        String strLJJLIIIJ2 = null;
        if ((value instanceof DeploymentModel) && (deploymentModel = (DeploymentModel) value) != null) {
            List<?> groupName = deploymentModel.getGroupName();
            if (groupName != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(groupName, 10));
                for (Object obj2 : groupName) {
                    if (obj2 instanceof DeploymentModelV4.V4Group) {
                        obj2 = ((DeploymentModelV4.V4Group) obj2).name;
                    } else if (!(obj2 instanceof String)) {
                        obj2 = "";
                    }
                    arrayList.add(obj2);
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, new C5180020c(str, 12), 30);
            } else {
                strLJJLIIIJ = null;
            }
            List<CheckRequestBodyModel.TargetChannel> targetChannels = deploymentModel.getTargetChannels();
            if (targetChannels != null) {
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(targetChannels, ",", null, null, 0, null, new AwS67S1000000_16(str, 40), 30);
            }
            List listLJIIJJI = C1697810uHb.LJIIJJI(strLJJLIIIJ, strLJJLIIIJ2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : listLJIIJJI) {
                String str2 = (String) obj3;
                if (str2 != null && str2.length() != 0) {
                    arrayList2.add(obj3);
                }
            }
            return C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
        }
        return str;
    }

    public static final Object invoke$21(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return new C1316950kNJ();
    }

    public static final Object invoke$22(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return new C1316950kNJ();
    }

    public static final Object invoke$23(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return ((InterfaceC1331800klG) obj).getKey();
    }

    public static final Object invoke$24(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return ((C1295090jo3) obj).LIZ.toString();
    }

    public static final Object invoke$25(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        C1331670kl3 c1331670kl3 = (C1331670kl3) obj;
        if (((Boolean) C286650BLj.LIZ.getValue()).booleanValue() && C1328130kfL.LJIILIIL().LJIIIIZZ().get("inbox_img_cache") != null) {
            c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3.LJJJJJ = "inbox_img_cache";
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        Set<String> setKeySet;
        int size;
        C1307030k7J c1307030k7J = (C1307030k7J) obj;
        if (c1307030k7J.LIZ) {
            Map<String, DecisionConfig> mapLIZLLL = C1306940k7A.LIZ.LIZ(EnumC1306750k6r.MULTI_MEDIA).LIZLLL("live");
            if (mapLIZLLL != null) {
                setKeySet = mapLIZLLL.keySet();
            } else {
                setKeySet = null;
            }
            C1306880k74 c1306880k74 = C1306880k74.LIZ;
            JSONArray jSONArray = new JSONArray((Collection) setKeySet);
            if (setKeySet != null) {
                size = setKeySet.size();
            } else {
                size = 0;
            }
            C1306880k74.LIZJ(c1306880k74, jSONArray, Integer.valueOf(size), "live");
        } else {
            int i = c1307030k7J.LIZJ;
            if (i == 0) {
                i = -1;
            }
            C1306880k74 c1306880k742 = C1306880k74.LIZ;
            Integer numValueOf = Integer.valueOf(i);
            String str = c1307030k7J.LIZIZ;
            c1306880k742.getClass();
            C1306880k74.LIZIZ(numValueOf, "live", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        Set<String> setKeySet;
        int size;
        C1307030k7J c1307030k7J = (C1307030k7J) obj;
        if (c1307030k7J.LIZ) {
            Map<String, DecisionConfig> mapLIZLLL = C1306940k7A.LIZ.LIZ(EnumC1306750k6r.MULTI_MEDIA).LIZLLL("vod");
            if (mapLIZLLL != null) {
                setKeySet = mapLIZLLL.keySet();
            } else {
                setKeySet = null;
            }
            C1306880k74 c1306880k74 = C1306880k74.LIZ;
            JSONArray jSONArray = new JSONArray((Collection) setKeySet);
            if (setKeySet != null) {
                size = setKeySet.size();
            } else {
                size = 0;
            }
            C1306880k74.LIZJ(c1306880k74, jSONArray, Integer.valueOf(size), "vod");
        } else {
            int i = c1307030k7J.LIZJ;
            if (i == 0) {
                i = -1;
            }
            C1306880k74 c1306880k742 = C1306880k74.LIZ;
            Integer numValueOf = Integer.valueOf(i);
            String str = c1307030k7J.LIZIZ;
            c1306880k742.getClass();
            C1306880k74.LIZIZ(numValueOf, "vod", str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        boolean z;
        List<ModelInfo> demotion_list = ((ModelInfo) obj).getDemotion_list();
        if (demotion_list != null) {
            z = !demotion_list.isEmpty();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        C0GTR c0gtr = new C0GTR((Context) obj, null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gtr);
        c0gtr.setLayoutParams(layoutParams);
        c0gtr.setRingWidth(C418440Gaw.LIZIZ(Double.valueOf(2.5d)));
        return c0gtr;
    }

    public static final Object invoke$6(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            StarshipBridge.Companion.onPitayaReady();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return new C1316950kNJ();
    }

    public static final Object invoke$8(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return new C1316950kNJ();
    }

    public static final Object invoke$9(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) throws JSONException {
        ((JSONObject) obj).put("use_effect", 0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return obj;
    }

    public static final Object invoke$5(AFwS258S0000000_20 aFwS258S0000000_20, Object obj) {
        return obj;
    }
}
