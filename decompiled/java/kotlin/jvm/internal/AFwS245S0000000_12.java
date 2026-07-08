package kotlin.jvm.internal;

import X.AbstractC1273900jFs;
import X.AbstractC777950UfR;
import X.C06W2;
import X.C086I;
import X.C09AY;
import X.C0JF1;
import X.C0KVU;
import X.C0TOM;
import X.C0TOS;
import X.C0TT6;
import X.C0TU2;
import X.C0TUD;
import X.C0TUE;
import X.C0U22;
import X.C0U24;
import X.C0U2R;
import X.C0U3Q;
import X.C0U7C;
import X.C0U9E;
import X.C0UAK;
import X.C0UBH;
import X.C0UC4;
import X.C0UEH;
import X.C0UEO;
import X.C0UFE;
import X.C0UFF;
import X.C0UFI;
import X.C0UFJ;
import X.C0UI0;
import X.C0UTW;
import X.C0UUC;
import X.C0UUE;
import X.C0UX6;
import X.C0UX8;
import X.C0UYQ;
import X.C0VSJ;
import X.C0WZX;
import X.C0XQ7;
import X.C1022620cia;
import X.C10EU;
import X.C1161920gLG;
import X.C11NJ;
import X.C1276840jKc;
import X.C1303280k1G;
import X.C1304710k3Z;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C13LE;
import X.C1483410ohn;
import X.C1623706Xj;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1833570xoZ;
import X.C1852920yJm;
import X.C19319810iC;
import X.C197600pS;
import X.C20286614Zk;
import X.C20441214yg;
import X.C20467080b;
import X.C20642515q3;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2174441A8c;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C326310Cqj;
import X.C354201Zc;
import X.C384050F3z;
import X.C418440Gaw;
import X.C474500IjA;
import X.C500260Jjc;
import X.C703302op;
import X.C720620SOm;
import X.C740650T3n;
import X.C745220TLc;
import X.C754060Ti0;
import X.C754650Tix;
import X.C766270U4b;
import X.C767250U7v;
import X.C767630U9h;
import X.C767640U9i;
import X.C768300UBw;
import X.C769740UHk;
import X.C770220UJg;
import X.C771320UNm;
import X.C771340UNo;
import X.C771680UOw;
import X.C773210UUt;
import X.C773220UUu;
import X.C775600Ube;
import X.C775720Ubq;
import X.C775850Uc3;
import X.C777840UfG;
import X.C781270Ukn;
import X.C781880Ulm;
import X.C782710Un7;
import X.C784280Upe;
import X.C784440Upu;
import X.C786410Ut5;
import X.C814420VxA;
import X.C849850XVn;
import X.C924400aAA;
import X.C956380azk;
import X.EnumC2636010g;
import X.EnumC721170SQp;
import X.EnumC754690Tj1;
import X.EnumC767650U9j;
import X.EnumC771230UNd;
import X.EnumC771350UNp;
import X.EnumC773040UUc;
import X.EnumC773520UVy;
import X.EnumC775860Uc4;
import X.EnumC781860Ulk;
import X.InterfaceC1105930esx;
import X.InterfaceC1106030et7;
import X.InterfaceC2262081DgM;
import X.InterfaceC769940UIe;
import X.InterfaceC771310UNl;
import X.InterfaceC771690UOx;
import X.InterfaceC771700UOy;
import X.InterfaceC772190UQv;
import X.InterfaceC774130UYh;
import X.InterfaceC774620Ua4;
import X.InterfaceC980390bcT;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.stablemode.DowngradeInfo;
import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.model.LogParams;
import com.bytedance.android.live.liveinteract.api.GuestManagePanelStickerChangeEvent;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.LeaveVideoModeVisibilityChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCast;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.bytedance.android.livesdk.livesetting.broadcast.MixStreamDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSAvPlayerLazyLoadSwitch;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ThirdPartyAdConsentPromptModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.setting.page.security.SecurityIncomeCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.experiment.TakoInfoModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.Reference;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import webcast.data.BottomContainerComponent;
import webcast.data.EffectStruct;

/* JADX INFO: loaded from: classes13.dex */
public class AFwS245S0000000_12 extends C09AY implements Function1 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(274);
    public final int $t;

    public static AFwS245S0000000_12 get$arr$(int i) {
        AFwS245S0000000_12 aFwS245S0000000_12 = (AFwS245S0000000_12) arr$.get(i);
        if (aFwS245S0000000_12 != null) {
            return aFwS245S0000000_12;
        }
        arr$.compareAndSet(i, null, new AFwS245S0000000_12(i));
        return (AFwS245S0000000_12) arr$.get(i);
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
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            case 66:
                return invoke$66(this, obj);
            case 67:
                return invoke$67(this, obj);
            case 68:
                return invoke$68(this, obj);
            case 69:
                return invoke$69(this, obj);
            case 70:
                return invoke$70(this, obj);
            case 71:
                return invoke$71(this, obj);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj);
            case 73:
                return invoke$73(this, obj);
            case 74:
                return invoke$74(this, obj);
            case 75:
                return invoke$75(this, obj);
            case 76:
                return invoke$76(this, obj);
            case 77:
                return invoke$77(this, obj);
            case 78:
                return invoke$78(this, obj);
            case 79:
                return invoke$79(this, obj);
            case 80:
                return invoke$80(this, obj);
            case 81:
                return invoke$81(this, obj);
            case 82:
                return invoke$82(this, obj);
            case 83:
                return invoke$83(this, obj);
            case 84:
                return invoke$84(this, obj);
            case 85:
                return invoke$85(this, obj);
            case 86:
                return invoke$86(this, obj);
            case 87:
                return invoke$87(this, obj);
            case 88:
                return invoke$88(this, obj);
            case 89:
                return invoke$89(this, obj);
            case 90:
                return invoke$90(this, obj);
            case 91:
                return invoke$91(this, obj);
            case 92:
                return invoke$92(this, obj);
            case 93:
                return invoke$93(this, obj);
            case 94:
                return invoke$94(this, obj);
            case 95:
                return invoke$95(this, obj);
            case 96:
                return invoke$96(this, obj);
            case 97:
                return invoke$97(this, obj);
            case 98:
                return invoke$98(this, obj);
            case 99:
                return invoke$99(this, obj);
            case 100:
                return invoke$100(this, obj);
            case 101:
                return invoke$101(this, obj);
            case 102:
                return invoke$102(this, obj);
            case 103:
                return invoke$103(this, obj);
            case 104:
                return invoke$104(this, obj);
            case 105:
                return invoke$105(this, obj);
            case 106:
                return invoke$106(this, obj);
            case 107:
                return invoke$107(this, obj);
            case 108:
                return invoke$108(this, obj);
            case 109:
                return invoke$109(this, obj);
            case 110:
                return invoke$110(this, obj);
            case 111:
                return invoke$111(this, obj);
            case 112:
                return invoke$112(this, obj);
            case 113:
                return invoke$113(this, obj);
            case 114:
                return invoke$114(this, obj);
            case 115:
                return invoke$115(this, obj);
            case 116:
                return invoke$116(this, obj);
            case 117:
                return invoke$117(this, obj);
            case 118:
                return invoke$118(this, obj);
            case 119:
                return invoke$119(this, obj);
            case 120:
                return invoke$120(this, obj);
            case 121:
                return invoke$121(this, obj);
            case 122:
                return invoke$122(this, obj);
            case 123:
                return invoke$123(this, obj);
            case 124:
                return invoke$124(this, obj);
            case 125:
                return invoke$125(this, obj);
            case 126:
                return invoke$126(this, obj);
            case 127:
                return invoke$127(this, obj);
            case 128:
                return invoke$128(this, obj);
            case 129:
                return invoke$129(this, obj);
            case 130:
                return invoke$130(this, obj);
            case 131:
                return invoke$131(this, obj);
            case 132:
                return invoke$132(this, obj);
            case 133:
                return invoke$133(this, obj);
            case 134:
                return invoke$134(this, obj);
            case 135:
                return invoke$135(this, obj);
            case 136:
                return invoke$136(this, obj);
            case 137:
                return invoke$137(this, obj);
            case 138:
                return invoke$138(this, obj);
            case 139:
                return invoke$139(this, obj);
            case 140:
                return invoke$140(this, obj);
            case 141:
                return invoke$141(this, obj);
            case 142:
                return invoke$142(this, obj);
            case 143:
                return invoke$143(this, obj);
            case 144:
                return invoke$144(this, obj);
            case 145:
                return invoke$145(this, obj);
            case 146:
                return invoke$146(this, obj);
            case 147:
                return invoke$147(this, obj);
            case 148:
                return invoke$148(this, obj);
            case 149:
                return invoke$149(this, obj);
            case 150:
                return invoke$150(this, obj);
            case 151:
                return invoke$151(this, obj);
            case 152:
                return invoke$152(this, obj);
            case 153:
                return invoke$153(this, obj);
            case 154:
                return invoke$154(this, obj);
            case 155:
                return invoke$155(this, obj);
            case 156:
                return invoke$156(this, obj);
            case 157:
                return invoke$157(this, obj);
            case 158:
                return invoke$158(this, obj);
            case 159:
                return invoke$159(this, obj);
            case 160:
                return invoke$160(this, obj);
            case 161:
                return invoke$161(this, obj);
            case 162:
                return invoke$162(this, obj);
            case 163:
                return invoke$163(this, obj);
            case 164:
                return invoke$164(this, obj);
            case 165:
                return invoke$165(this, obj);
            case 166:
                return invoke$166(this, obj);
            case 167:
                return invoke$167(this, obj);
            case 168:
                return invoke$168(this, obj);
            case 169:
                return invoke$169(this, obj);
            case 170:
                return invoke$170(this, obj);
            case 171:
                return invoke$171(this, obj);
            case 172:
                return invoke$172(this, obj);
            case 173:
                return invoke$173(this, obj);
            case 174:
                return invoke$174(this, obj);
            case 175:
                return invoke$175(this, obj);
            case 176:
                return invoke$176(this, obj);
            case 177:
                return invoke$177(this, obj);
            case 178:
                return invoke$178(this, obj);
            case 179:
                return invoke$179(this, obj);
            case 180:
                return invoke$180(this, obj);
            case 181:
                return invoke$181(this, obj);
            case 182:
                return invoke$182(this, obj);
            case 183:
                return invoke$183(this, obj);
            case 184:
                return invoke$184(this, obj);
            case 185:
                return invoke$185(this, obj);
            case 186:
                return invoke$186(this, obj);
            case 187:
                return invoke$187(this, obj);
            case 188:
                return invoke$188(this, obj);
            case 189:
                return invoke$189(this, obj);
            case 190:
                return invoke$190(this, obj);
            case 191:
                return invoke$191(this, obj);
            case 192:
                return invoke$192(this, obj);
            case 193:
                return invoke$193(this, obj);
            case 194:
                return invoke$194(this, obj);
            case 195:
                return invoke$195(this, obj);
            case 196:
                return invoke$196(this, obj);
            case 197:
                return invoke$197(this, obj);
            case 198:
                return invoke$198(this, obj);
            case 199:
                return invoke$199(this, obj);
            case 200:
                return invoke$200(this, obj);
            case 201:
                return invoke$201(this, obj);
            case 202:
                return invoke$202(this, obj);
            case 203:
                return invoke$203(this, obj);
            case 204:
                return invoke$204(this, obj);
            case 205:
                return invoke$205(this, obj);
            case 206:
                return invoke$206(this, obj);
            case 207:
                return invoke$207(this, obj);
            case 208:
                return invoke$208(this, obj);
            case 209:
                return invoke$209(this, obj);
            case 210:
                return invoke$210(this, obj);
            case 211:
                return invoke$211(this, obj);
            case 212:
                return invoke$212(this, obj);
            case 213:
                return invoke$213(this, obj);
            case 214:
                return invoke$214(this, obj);
            case 215:
                return invoke$215(this, obj);
            case 216:
                return invoke$216(this, obj);
            case 217:
                return invoke$217(this, obj);
            case 218:
                return invoke$218(this, obj);
            case 219:
                return invoke$219(this, obj);
            case 220:
                return invoke$220(this, obj);
            case 221:
                return invoke$221(this, obj);
            case 222:
                return invoke$222(this, obj);
            case 223:
                return invoke$223(this, obj);
            case 224:
                return invoke$224(this, obj);
            case 225:
                return invoke$225(this, obj);
            case 226:
                return invoke$226(this, obj);
            case 227:
                return invoke$227(this, obj);
            case 228:
                return invoke$228(this, obj);
            case 229:
                return invoke$229(this, obj);
            case 230:
                return invoke$230(this, obj);
            case 231:
                return invoke$231(this, obj);
            case 232:
                return invoke$232(this, obj);
            case 233:
                return invoke$233(this, obj);
            case 234:
                return invoke$234(this, obj);
            case 235:
                return invoke$235(this, obj);
            case 236:
                return invoke$236(this, obj);
            case 237:
                return invoke$237(this, obj);
            case 238:
                return invoke$238(this, obj);
            case 239:
                return invoke$239(this, obj);
            case 240:
                return invoke$240(this, obj);
            case 241:
                return invoke$241(this, obj);
            case 242:
                return invoke$242(this, obj);
            case 243:
                return invoke$243(this, obj);
            case 244:
                return invoke$244(this, obj);
            case 245:
                return invoke$245(this, obj);
            case 246:
                return invoke$246(this, obj);
            case 247:
                return invoke$247(this, obj);
            case 248:
                return invoke$248(this, obj);
            case 249:
                return invoke$249(this, obj);
            case 250:
                return invoke$250(this, obj);
            case 251:
                return invoke$251(this, obj);
            case 252:
                return invoke$252(this, obj);
            case 253:
                return invoke$253(this, obj);
            case 254:
                return invoke$254(this, obj);
            case 255:
                return invoke$255(this, obj);
            case 256:
                return invoke$256(this, obj);
            case 257:
                return invoke$257(this, obj);
            case 258:
                return invoke$258(this, obj);
            case 259:
                return invoke$259(this, obj);
            case 260:
                return invoke$260(this, obj);
            case 261:
                return invoke$261(this, obj);
            case 262:
                return invoke$262(this, obj);
            case 263:
                return invoke$263(this, obj);
            case 264:
                return invoke$264(this, obj);
            case 265:
                return invoke$265(this, obj);
            case 266:
                return invoke$266(this, obj);
            case 267:
                return invoke$267(this, obj);
            case 268:
                return invoke$268(this, obj);
            case 269:
                return invoke$269(this, obj);
            case 270:
                return invoke$270(this, obj);
            case 271:
                return invoke$271(this, obj);
            case 272:
                return invoke$272(this, obj);
            case 273:
                return invoke$273(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS245S0000000_12(int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LJIIJJI("system_event_resume_pushing", "");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        InterfaceC772190UQv.j4.LJFF(0);
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJIIL.put("livesdk_anchor_stable_mode_button", String.valueOf(0));
        obj.getClass();
        return new C775720Ubq(false, false);
    }

    public static final Object invoke$10(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((C767640U9i) obj).LJ != EnumC767650U9j.CO_HOST_SAME) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$102(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        LiveEffect liveEffect = (LiveEffect) obj;
        if (liveEffect.LJLIL() != C0U9E.NONE && !C767250U7v.LJIIIIZZ(liveEffect)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$103(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((C0U3Q) obj).name();
    }

    public static final Object invoke$104(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (C771680UOw.LIZJ) {
            if (zBooleanValue) {
                InterfaceC771690UOx interfaceC771690UOx = C771680UOw.LJIIL;
                if (interfaceC771690UOx != null) {
                    interfaceC771690UOx.LIZ();
                }
                InterfaceC771700UOy interfaceC771700UOy = C771680UOw.LJIILIIL;
                if (interfaceC771700UOy != null) {
                    interfaceC771700UOy.LIZ();
                }
            } else {
                if (C771680UOw.LJIIIZ) {
                    InterfaceC771690UOx interfaceC771690UOx2 = C771680UOw.LJIIL;
                    if (interfaceC771690UOx2 != null) {
                        interfaceC771690UOx2.LIZIZ();
                    }
                } else {
                    InterfaceC771690UOx interfaceC771690UOx3 = C771680UOw.LJIIL;
                    if (interfaceC771690UOx3 != null) {
                        interfaceC771690UOx3.LIZJ(C771680UOw.LJI);
                    }
                }
                InterfaceC771700UOy interfaceC771700UOy2 = C771680UOw.LJIILIIL;
                if (interfaceC771700UOy2 != null) {
                    interfaceC771700UOy2.LIZIZ(C771680UOw.LJII, C771680UOw.LJIIIIZZ);
                }
                C771680UOw.LJIIL = null;
                C771680UOw.LJIILIIL = null;
                C771680UOw.LJ = null;
                C771680UOw.LJFF = null;
                C771680UOw.LIZJ = false;
                C771680UOw.LIZLLL = false;
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$105(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((Number) obj).longValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$106(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((Number) obj).longValue();
        return Unit.LIZ;
    }

    public static final Object invoke$107(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((Number) obj).longValue();
        C20441214yg.LIZIZ("PlayBookViewModel", "createPlaybookDetailDialogDismissListener");
        return Unit.LIZ;
    }

    public static final Object invoke$108(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.valueOf(!((InetAddress) obj).isLoopbackAddress());
    }

    public static final Object invoke$109(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C20684815ws.onEventV3("tns_br_election_share_prompt_cancel");
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        C767640U9i c767640U9i = (C767640U9i) obj;
        if (c767640U9i.LJI && c767640U9i.LJ != EnumC767650U9j.CO_HOST_SAME) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$110(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.TRUE;
    }

    public static final Object invoke$111(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.TRUE;
    }

    public static final Object invoke$112(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
        C0UFI.LJIJJ((List) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$113(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0UAK liveGoalLogHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalLogHelper();
        if (zBooleanValue) {
            liveGoalLogHelper.getClass();
            LogParams logParams = C0UFJ.LIZIZ;
            if (logParams.dragMode == 0) {
                logParams.isAdjust = 1;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$114(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131848583, null);
        return Unit.LIZ;
    }

    public static final Object invoke$115(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((C0UBH) obj).LIZ;
    }

    public static final Object invoke$116(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C1389890mGx c1389890mGx = new C1389890mGx((View) obj);
        c1389890mGx.LJIIIZ(2131830346);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$117(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((Reference) obj).get() == null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$118(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII("background", "features");
        return c474500IjA;
    }

    public static final Object invoke$119(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((AnchorLevelPermission) obj).liveBackground;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$12(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((C956380azk) obj).LIZ == 1) {
            C767630U9h c767630U9h = C767630U9h.LL;
            EnumC767650U9j enumC767650U9j = EnumC767650U9j.CO_HOST_SAME;
            c767630U9h.getClass();
            C767630U9h.LJIIL(enumC767650U9j);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$120(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((AnchorLevelPermission) obj).voiceEffect;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$121(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII("voice_effect", "features");
        return c474500IjA;
    }

    public static final Object invoke$122(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ContextWrapper contextWrapper;
        Context context = (Context) obj;
        if (!(context instanceof ContextWrapper) || (contextWrapper = (ContextWrapper) context) == null) {
            return null;
        }
        return contextWrapper.getBaseContext();
    }

    public static final Object invoke$123(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return String.valueOf(((LinkUser) obj).userId);
    }

    public static final Object invoke$124(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return String.valueOf(((LinkUser) obj).userId);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$125(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$126(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C20441214yg.LJ("VideoBroadcastInteractionFragment", "Failed to fetch game effect list.");
        return Unit.LIZ;
    }

    public static final Object invoke$127(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
        C0UFI.LJIJJ((List) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$128(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0UAK liveGoalLogHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalLogHelper();
        if (zBooleanValue) {
            liveGoalLogHelper.getClass();
            LogParams logParams = C0UFJ.LIZIZ;
            if (logParams.dragMode == 0) {
                logParams.isAdjust = 1;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$129(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((C754060Ti0) obj).LIZJ;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$13(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        Set<LiveEffect> set = C767630U9h.LLILZIL;
        set.clear();
        set.addAll((Set) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$130(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((C754060Ti0) obj).LJ;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$131(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((C754060Ti0) obj).LIZLLL;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$132(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ContextWrapper contextWrapper;
        Context context = (Context) obj;
        if (!(context instanceof ContextWrapper) || (contextWrapper = (ContextWrapper) context) == null) {
            return null;
        }
        return contextWrapper.getBaseContext();
    }

    public static final Object invoke$133(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((DownloadInfo) obj).getMimeType(), "live_music_accompaniment"));
    }

    public static final Object invoke$134(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131830645, null);
        return Unit.LIZ;
    }

    public static final Object invoke$135(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131830645, null);
        return Unit.LIZ;
    }

    public static final Object invoke$136(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131830645, null);
        return Unit.LIZ;
    }

    public static final Object invoke$137(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        Hashtag hashtag;
        List<GameTag> list;
        Hashtag hashtag2;
        List<GameTag> list2;
        Hashtag hashtag3;
        List<GameTag> list3;
        Hashtag hashtag4;
        List<Hashtag> list4;
        Hashtag next;
        Long l;
        Long l2;
        List<Hashtag> list5;
        Hashtag next2;
        Long l3;
        Long l4;
        List<Hashtag> list6;
        Hashtag next3;
        Long l5;
        Long l6;
        HashtagResponse hashtagResponse = (HashtagResponse) obj;
        EnumC754690Tj1 enumC754690Tj1 = EnumC754690Tj1.VIDEO;
        List<GameTag> list7 = null;
        if (hashtagResponse != null && (list6 = hashtagResponse.hashtags) != null) {
            Iterator<Hashtag> it2 = list6.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next3 = it2.next();
                    Hashtag hashtag5 = next3;
                    if (hashtag5 != null) {
                        l5 = hashtag5.id;
                    } else {
                        l5 = null;
                    }
                    Hashtag hashtag6 = enumC754690Tj1.getHashtag();
                    if (hashtag6 != null) {
                        l6 = hashtag6.id;
                    } else {
                        l6 = null;
                    }
                    if (Intrinsics.LJFF(l5, l6)) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            hashtag = next3;
        } else {
            hashtag = null;
        }
        if (hashtagResponse != null) {
            list = hashtagResponse.gameTagList;
        } else {
            list = null;
        }
        enumC754690Tj1.updateHashTagGameTag(hashtag, C754650Tix.LIZIZ(enumC754690Tj1, list));
        EnumC754690Tj1 enumC754690Tj12 = EnumC754690Tj1.SCREEN_RECORD;
        if (hashtagResponse != null) {
            hashtag2 = hashtagResponse.gameHashTag;
            list2 = hashtagResponse.gameTagList;
        } else {
            hashtag2 = null;
            list2 = null;
        }
        enumC754690Tj12.updateHashTagGameTag(hashtag2, C754650Tix.LIZIZ(enumC754690Tj12, list2));
        EnumC754690Tj1 enumC754690Tj13 = EnumC754690Tj1.LIVE_VOICE;
        if (hashtagResponse != null && (list5 = hashtagResponse.liveVoiceHashtag) != null) {
            Iterator<Hashtag> it3 = list5.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    Hashtag hashtag7 = next2;
                    if (hashtag7 != null) {
                        l3 = hashtag7.id;
                    } else {
                        l3 = null;
                    }
                    Hashtag hashtag8 = enumC754690Tj13.getHashtag();
                    if (hashtag8 != null) {
                        l4 = hashtag8.id;
                    } else {
                        l4 = null;
                    }
                    if (Intrinsics.LJFF(l3, l4)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            hashtag3 = next2;
        } else {
            hashtag3 = null;
        }
        if (hashtagResponse != null) {
            list3 = hashtagResponse.gameTagList;
        } else {
            list3 = null;
        }
        enumC754690Tj13.updateHashTagGameTag(hashtag3, C754650Tix.LIZIZ(enumC754690Tj13, list3));
        EnumC754690Tj1 enumC754690Tj14 = EnumC754690Tj1.THIRD_PARTY;
        if (hashtagResponse != null && (list4 = hashtagResponse.obsHashTag) != null) {
            Iterator<Hashtag> it4 = list4.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next = it4.next();
                    Hashtag hashtag9 = next;
                    if (hashtag9 != null) {
                        l = hashtag9.id;
                    } else {
                        l = null;
                    }
                    Hashtag hashtag10 = enumC754690Tj14.getHashtag();
                    if (hashtag10 != null) {
                        l2 = hashtag10.id;
                    } else {
                        l2 = null;
                    }
                    if (Intrinsics.LJFF(l, l2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            hashtag4 = next;
        } else {
            hashtag4 = null;
        }
        if (hashtagResponse != null) {
            list7 = hashtagResponse.gameTagList;
        }
        enumC754690Tj14.updateHashTagGameTag(hashtag4, C754650Tix.LIZIZ(enumC754690Tj14, list7));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$138(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$139(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.valueOf(!((C767640U9i) obj).LJI);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$140(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$141(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$142(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((C754060Ti0) obj).LIZJ;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$143(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$144(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$145(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((BottomContainerComponent) obj).type == 7) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$146(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$147(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((InterfaceC774620Ua4) obj).LLZ() != EnumC773520UVy.LONG_TERM) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$148(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        InterfaceC774620Ua4 interfaceC774620Ua4 = (InterfaceC774620Ua4) obj;
        if (interfaceC774620Ua4.LLZ() != EnumC773520UVy.VIDEO_BROADCAST_PAGE && interfaceC774620Ua4.LLZ() != EnumC773520UVy.PREVIEW_AND_VIDEO_BROADCAST_PAGE) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$149(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((InterfaceC774620Ua4) obj).LLZ() == EnumC773520UVy.PREVIEW_PAGE) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$15(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.valueOf(!C10EU.LJIIIIZZ());
    }

    public static final Object invoke$150(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        InterfaceC774620Ua4 interfaceC774620Ua4 = (InterfaceC774620Ua4) obj;
        if (interfaceC774620Ua4.LLZ() != EnumC773520UVy.PREVIEW_AND_VIDEO_BROADCAST_PAGE && interfaceC774620Ua4.LLZ() != EnumC773520UVy.FULL_LIFE_CYCLE) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$151(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$152(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.TRUE;
    }

    public static final Object invoke$153(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("system_exit_not_opening_setting", "");
        return Unit.LIZ;
    }

    public static final Object invoke$154(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("system_exit_not_opening_setting", "");
        return Unit.LIZ;
    }

    public static final Object invoke$155(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "click_value");
        C20684815ws.LJIILLIIL("click_ad_data_consent_prompt_buttons", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$156(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$157(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$158(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String strLIZIZ = C20467080b.LIZIZ(2131826629);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        c1397620mTQ.LIZJ(0, strLIZIZ, get$arr$(157));
        return Unit.LIZ;
    }

    public static final Object invoke$159(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            return aweme.getAuthor();
        }
        return null;
    }

    public static final Object invoke$16(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (!C10EU.LJIIIIZZ() && !TextUtils.isEmpty(C0TU2.LIZIZ.LIZ())) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$160(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$161(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131824800, get$arr$(160));
        return Unit.LIZ;
    }

    public static final Object invoke$162(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        String message;
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseManifestJsonFile cancel, ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C1022620cia.LJ("AnolePlayableComponent", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$163(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$164(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LIZJ(0, "Close", get$arr$(163));
        return Unit.LIZ;
    }

    public static final Object invoke$165(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$166(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LIZJ(0, "Close", get$arr$(165));
        return Unit.LIZ;
    }

    public static final Object invoke$167(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            RedDotExtensionKt.LIZ(C0UX6.MULTI_GUEST_MODERATOR_DIRECT);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$168(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            RedDotExtensionKt.LIZ(C0UX6.MULTI_GUEST_GIFT_PRIORITY_DIRECT);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$169(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            RedDotExtensionKt.LIZ(C0UX6.RED_DOT_ANCHOR_SHARE_BACKGROUND_DIRECT);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean zLIZ;
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_income_plus_reauth", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLIZ = false;
        }
        if (zLIZ) {
            C0XQ7.LJ();
            if (C0XQ7.LIZ.LJIIJ().getCurUser().getAccountType() == 2 && C2174441A8c.LIZIZ.LJFF(SecurityIncomeCell.class)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$170(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        c773210UUt.getClass();
        c773210UUt.LJIIJJI("system_event_pre_check_finished", "");
        return Unit.LIZ;
    }

    public static final Object invoke$171(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        c773210UUt.LJIILL("user_enter_resume_live");
        C773220UUu.LJIIIIZZ = c773210UUt.LIZIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$172(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1304710k3Z.LIZ.LJII(1102, "oldBeauty", null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$173(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C849850XVn.LIZIZ.LIZJ().LJIJI("87", "passkey_profile_error_modalSecondaryBtn", true);
        return Unit.LIZ;
    }

    public static final Object invoke$174(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(0, "error_type");
        c2344009Gk.LIZJ(0, "click_value");
        c2344009Gk.LJ(C0TOS.LJ, "product_line");
        C20684815ws.LJIILLIIL("click_payment_error_prompt", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$175(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "error_type");
        c2344009Gk.LIZJ(0, "click_value");
        c2344009Gk.LJ(C0TOS.LJ, "product_line");
        C20684815ws.LJIILLIIL("click_payment_error_prompt", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$176(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((AnchorLevelPermission) obj).pin;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$177(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.TRUE;
    }

    public static final Object invoke$178(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return C2204961BRm.LJJJLIIL(new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8JkU7S83oC39JceYzy+GxSptlI1", null));
    }

    public static final Object invoke$179(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((AnchorLevelPermission) obj).goodyBag;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$18(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        C1397620mTQ.LJI(c1397620mTQ, C20642515q3.LJI(2131829465));
        c1397620mTQ.LIZJ(1, C20642515q3.LJI(2131829466), null);
        return Unit.LIZ;
    }

    public static final Object invoke$180(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII("goody_bag", "features");
        return c474500IjA;
    }

    public static final Object invoke$181(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((AnchorLevelPermission) obj).goodyBag;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$182(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((AnchorLevelPermission) obj).goodyBag;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$183(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((AnchorLevelPermission) obj).goodyBag;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$184(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII("goody_bag", "features");
        return c474500IjA;
    }

    public static final Object invoke$185(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        DataChannel dataChannel = C0UEH.LIZIZ;
        if (dataChannel != null) {
            dataChannel.LC0(GuestManagePanelStickerChangeEvent.class, obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$186(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user status is: ");
        sbLIZ.append(iIntValue);
        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ));
        if (iIntValue >= 2 && iIntValue <= 5) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C0UEH.LJIIIIZZ = boolValueOf;
        if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
            C0UEH.LJIIIZ = false;
            C0UEH.LJIIJ = false;
            C0UEH.LJIIL = null;
            C768300UBw.LIZLLL();
            C0UEH.LIZJ("user status change");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$187(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UEH.LJIIIZ = ((C0UI0) obj).LIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$188(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UEH.LJIIJ = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("managePanelCameraOpen: ");
        sbLIZ.append(C0UEH.LJIIJ);
        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$189(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return C0KVU.LIZ((User) obj);
    }

    public static final Object invoke$19(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return new C1303280k1G((Context) obj);
    }

    public static final Object invoke$190(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return C0KVU.LJ((User) obj);
    }

    public static final Object invoke$191(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UUC c0uuc = C0UUC.LIZ;
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.STICKER;
        EnumC771230UNd enumC771230UNd = EnumC771230UNd.APPLY_FINISH;
        c0uuc.getClass();
        C0UUC.LIZIZ(enumC773040UUc, enumC771230UNd, null);
        return Unit.LIZ;
    }

    public static final Object invoke$192(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UUC c0uuc = C0UUC.LIZ;
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.STICKER;
        EnumC771230UNd enumC771230UNd = EnumC771230UNd.APPLYING;
        c0uuc.getClass();
        C0UUC.LIZIZ(enumC773040UUc, enumC771230UNd, (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$193(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UUE c0uue = (C0UUE) obj;
        C0UUC c0uuc = C0UUC.LIZ;
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.VOICE_EFFECTS;
        EnumC771230UNd enumC771230UNd = c0uue.LIZ;
        String str = c0uue.LIZIZ;
        c0uuc.getClass();
        C0UUC.LIZIZ(enumC773040UUc, enumC771230UNd, str);
        return Unit.LIZ;
    }

    public static final Object invoke$194(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            int i = C771340UNo.LIZ;
            C771340UNo.LIZIZ("karaoke", String.valueOf(((Number) entry.getKey()).longValue()));
            int i2 = 0;
            for (Object obj2 : (Iterable) entry.getValue()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str = (String) obj2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    EnumC771350UNp enumC771350UNp = EnumC771350UNp.LIVE_KARAOKE;
                    sbLIZ.append(enumC771350UNp.getFullPath());
                    sbLIZ.append(str);
                    new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).delete();
                    if (i2 == 2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(enumC771350UNp.getFullPath());
                        sbLIZ2.append(str);
                        sbLIZ2.append(".lrc");
                        new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).delete();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(enumC771350UNp.getFullPath());
                        sbLIZ3.append(str);
                        sbLIZ3.append(".krc");
                        new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3)).delete();
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$195(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C20441214yg.LIZIZ("KaraokeDownloader", "onStart");
        return Unit.LIZ;
    }

    public static final Object invoke$196(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C20441214yg.LIZIZ("KaraokeDownloader", "onCancel");
        return Unit.LIZ;
    }

    public static final Object invoke$197(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C20441214yg.LIZIZ("KaraokeDownloader", "onPause");
        return Unit.LIZ;
    }

    public static final Object invoke$198(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return new LinearLayout((Context) obj);
    }

    public static final Object invoke$199(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        c773210UUt.getClass();
        if (!C773220UUu.LJIIJJI) {
            c773210UUt.LJIIJJI("system_event_start_enter_room", "");
            C773220UUu.LJIIJJI = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        InterfaceC772190UQv.j4.LJFF(1);
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJIIL.put("livesdk_anchor_stable_mode_button", String.valueOf(1));
        obj.getClass();
        return new C775720Ubq(true, false);
    }

    public static final Object invoke$20(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("system_exit_force_finish_illegal", "");
        return Unit.LIZ;
    }

    public static final Object invoke$200(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LJIIIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$201(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("user_exit_media_projection_not_allowed", "");
        return Unit.LIZ;
    }

    public static final Object invoke$202(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        c773210UUt.getClass();
        if (!C773220UUu.LJIIJJI) {
            c773210UUt.LJIIJJI("system_event_start_enter_room", "");
            C773220UUu.LJIIJJI = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$203(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LJIIIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$204(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((StackTraceElement) obj).toString();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$205(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$206(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C19319810iC c19319810iC = (C19319810iC) obj;
        C19319810iC.LJJIJL(c19319810iC, !c19319810iC.LLJJIJIL, null, null, false, null, false, false, false, false, null, false, 131070);
        return C19319810iC.LJJIJL(c19319810iC, false, null, null, false, null, false, true, false, false, null, false, 126975);
    }

    public static final Object invoke$207(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return C19319810iC.LJJIJL((C19319810iC) obj, !r1.LLJJIJIL, null, null, false, null, false, false, false, false, null, false, 126974);
    }

    public static final Object invoke$208(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return C19319810iC.LJJIJL((C19319810iC) obj, !r1.LLJJIJIL, null, null, false, null, false, false, false, false, null, false, 131070);
    }

    public static final Object invoke$209(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((C740650T3n) obj).LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$21(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$210(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("system_exit_first_start_stream_failed", "");
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$211(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$212(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C770220UJg.LIZLLL(C13LE.LIZ(EffectDialogShowChannel.class));
        } else {
            C770220UJg c770220UJg2 = C770220UJg.LIZ;
            C770220UJg.LJ(C13LE.LIZ(EffectDialogShowChannel.class));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$213(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.TRUE;
    }

    public static final Object invoke$214(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$215(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$216(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bubble dismiss, with ");
        sbLIZ.append(obj.getClass().getSimpleName());
        C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$217(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$218(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$219(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return String.valueOf(((LinkUser) obj).userId);
    }

    public static final Object invoke$22(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C766270U4b.LIZLLL(((Integer) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$220(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C777840UfG.LJII(new AbstractC777950UfR() { // from class: X.0Uf4
            public final EnumC777930UfP LJ = EnumC777930UfP.PRIORITY_TYPE_P2;
            public final EnumC777480Ueg LJFF = EnumC777480Ueg.CAPTCHA;
            public final CharSequence LJI = C497740JfY.LJIJI(2131842871);

            {
                this.LIZ = new AbstractC777790UfB() { // from class: X.0Uf3
                    public final EnumC777770Uf9 LIZ = EnumC777770Uf9.TRIANGLE_WARNING_RED;

                    @Override // X.AbstractC777790UfB
                    public final EnumC777770Uf9 LIZ() {
                        return this.LIZ;
                    }
                };
                this.LIZIZ = new AbstractC777790UfB() { // from class: X.0Uf5
                    public final EnumC777770Uf9 LIZ = EnumC777770Uf9.BACK;

                    @Override // X.AbstractC777790UfB
                    public final EnumC777770Uf9 LIZ() {
                        return this.LIZ;
                    }
                };
            }

            @Override // X.AbstractC777950UfR
            public final EnumC777930UfP LIZJ() {
                return this.LJ;
            }

            @Override // X.AbstractC777950UfR
            public final CharSequence LIZLLL() {
                return this.LJI;
            }

            @Override // X.AbstractC777950UfR
            public final EnumC777480Ueg LJ() {
                return this.LJFF;
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$221(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("system_exit_record_permission_canceled", "");
        return Unit.LIZ;
    }

    public static final Object invoke$222(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("system_exit_record_permission_resume_canceled", "");
        return Unit.LIZ;
    }

    public static final Object invoke$223(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        InterfaceC1106030et7.p9.LIZJ(Boolean.FALSE);
        return C775600Ube.LIZ((C775600Ube) obj, false, 2);
    }

    public static final Object invoke$224(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        InterfaceC1106030et7.p9.LIZJ(Boolean.TRUE);
        return C775600Ube.LIZ((C775600Ube) obj, true, 2);
    }

    public static final Object invoke$225(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return C775600Ube.LIZ((C775600Ube) obj, false, 3);
    }

    public static final Object invoke$226(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((AnchorLevelPermission) obj).karaoke;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$227(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((AnchorLevelPermission) obj).karaoke;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$228(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII("karaoke", "features");
        return c474500IjA;
    }

    public static final Object invoke$229(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131850878, null);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.valueOf(((LiveEffect) obj).LLJJJ());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$230(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$231(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131829971, null);
        return Unit.LIZ;
    }

    public static final Object invoke$232(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z = ((InterfaceC1105930esx) obj) instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        return Unit.LIZ;
    }

    public static final Object invoke$233(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return C0UEO.LJ((EffectStruct) obj);
    }

    public static final Object invoke$234(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        LiveEffect liveEffect = (LiveEffect) obj;
        if (C0U7C.LJIIJ(liveEffect) == null && C086I.LIZIZ(liveEffect.LL()) && !liveEffect.LJJIJIIJI()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$235(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        LiveEffect liveEffect = (LiveEffect) obj;
        if (C0U7C.LJIIJ(liveEffect) == null && !liveEffect.LJJIJIIJI()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$236(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((C0UBH) obj).LIZ;
    }

    public static final Object invoke$237(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ContextWrapper contextWrapper;
        Context context = (Context) obj;
        if (!(context instanceof ContextWrapper) || (contextWrapper = (ContextWrapper) context) == null) {
            return null;
        }
        return contextWrapper.getBaseContext();
    }

    public static final Object invoke$238(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$239(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("outreach flow record request failed!");
        sbLIZ.append(", cause: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C1720106oR.LIZ("outreach_flow_report_progress", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UC4.LJIL.LIZIZ("render_time");
        return Unit.LIZ;
    }

    public static final Object invoke$240(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFF c0uff = C0UFE.Companion;
        int i = ((AnchorLevelPermission) obj).sticker;
        c0uff.getClass();
        return C0UFF.LIZ(i);
    }

    public static final Object invoke$241(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue() && C781270Ukn.LJI().isUsingAccompanimentBusiness()) {
            C781270Ukn.LJI().pauseAccompanimentPlay(Boolean.TRUE);
            C766270U4b.LIZLLL(2131842667);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$242(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.FALSE;
    }

    public static final Object invoke$243(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.FALSE;
    }

    public static final Object invoke$244(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$245(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return C19319810iC.LJJIJL((C19319810iC) obj, !r1.LLJJIJIL, null, null, false, null, false, false, false, false, null, false, 131070);
    }

    public static final Object invoke$246(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((C0U22) obj).LJIILJJIL != C0U2R.IDLE) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$247(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((C0U22) obj).LJ(C0U2R.IDLE);
    }

    public static final Object invoke$248(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((C0U22) obj).LJIILJJIL != C0U2R.IDLE) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$249(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((C0U22) obj).LJ(C0U2R.IDLE);
    }

    public static final Object invoke$25(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return new InterfaceC771310UNl() { // from class: X.0UNk
            public long LIZ;
            public int LIZIZ;

            @Override // X.InterfaceC771310UNl
            public final int getPriority() {
                return 0;
            }

            @Override // X.InterfaceC771310UNl
            public final Map<String, String> execute() {
                return C2097908Jt.LIZJ(new Pair("storageSize", String.valueOf(this.LIZ)));
            }

            @Override // X.InterfaceC771310UNl
            public final void LIZ(File file, boolean z) {
                if (file.isDirectory()) {
                    return;
                }
                this.LIZ += file.length();
                this.LIZIZ++;
            }
        };
    }

    public static final Object invoke$250(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((C0U22) obj).LJIILIIL != C0U24.NOT_REQUESTED) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$251(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((C0U22) obj).LJFF(C0U24.NOT_REQUESTED);
    }

    public static final Object invoke$252(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((C0U22) obj).LJIILIIL != C0U24.NOT_REQUESTED) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$253(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((C0U22) obj).LJFF(C0U24.NOT_REQUESTED);
    }

    public static final Object invoke$254(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((C0U22) obj).LJ(C0U2R.PAUSE);
    }

    public static final Object invoke$255(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((C0U22) obj).LJ(C0U2R.PLAYING);
    }

    public static final Object invoke$256(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.valueOf(((C0U22) obj).LJIIL());
    }

    public static final Object invoke$257(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C20684815ws.LJIILLIIL("invite_card_show", C2097908Jt.LIZJ(new Pair("enter_from", "homepage_friends")));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$258(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        Context context = (Context) obj;
        View viewLIZ = C0JF1.LIZ(context, R.layout.caa, null);
        View viewFindViewById = viewLIZ.findViewById(R.id.kbc);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(84));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
        viewFindViewById.setBackground(c384050F3z.LIZ(context));
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0TAf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SmartRouter.buildRoute(view.getContext(), "//friends/invite").open();
                C20684815ws.LJIILLIIL("invite_friends", C2097908Jt.LIZJ(new Pair("enter_from", "homepage_friends")));
            }
        }, viewFindViewById);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0TAg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SmartRouter.buildRoute(view.getContext(), "//friends/invite").open();
                C20684815ws.LJIILLIIL("invite_friends", C2097908Jt.LIZJ(new Pair("enter_from", "homepage_friends")));
            }
        }, viewLIZ.findViewById(R.id.d6g));
        C0TT6.LIZJ(viewLIZ, "homepage_friends_empty_invite", get$arr$(257));
        return viewLIZ;
    }

    public static final Object invoke$259(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1i, (Context) obj);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$26(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C771320UNm c771320UNm = new C771320UNm();
        c771320UNm.LIZ = true;
        return c771320UNm;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$260(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$261(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((com.ss.android.ugc.aweme.profile.model.User) obj).getUid();
    }

    public static final Object invoke$262(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$263(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return ((com.ss.android.ugc.aweme.profile.model.User) obj).getUid();
    }

    public static final Object invoke$264(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        C0U9E c0u9eLJLIL = ((LiveEffect) obj).LJLIL();
        if (c0u9eLJLIL != C0U9E.MORE_V1 && c0u9eLJLIL != C0U9E.MORE_V2) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$265(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$266(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$267(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$268(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$269(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C769740UHk c769740UHk = (C769740UHk) obj;
        ((C11NJ) c769740UHk.LIZ.LIZ.getValue()).dispose();
        c769740UHk.LIZ().onDestroy();
        return Unit.LIZ;
    }

    public static final Object invoke$270(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$271(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$272(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.valueOf(!((InetAddress) obj).isLoopbackAddress());
    }

    public static final Object invoke$273(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        String levelName;
        ModuleDecision moduleDecision = (ModuleDecision) obj;
        List<String> list = moduleDecision.features;
        C781880Ulm.LIZIZ = list.contains(EnumC781860Ulk.GIFT_TRAY_ANIMATION_BLOCK.getFeatureName());
        C781880Ulm.LIZJ = list.contains(EnumC781860Ulk.GIFT_LYNX_ANIMATION_BLOCK.getFeatureName());
        C781880Ulm.LIZLLL = list.contains(EnumC781860Ulk.GIFT_TRACKING_BLOCK_FIRST.getFeatureName());
        C781880Ulm.LJ = list.contains(EnumC781860Ulk.GIFT_TRACKING_BLOCK_SECOND.getFeatureName());
        C781880Ulm.LJFF = list.contains(EnumC781860Ulk.GIFT_EFFECT_BLOCK.getFeatureName());
        C775850Uc3 c775850Uc3 = EnumC775860Uc4.Companion;
        DowngradeInfo downgradeInfo = moduleDecision.LIZ;
        if (downgradeInfo == null || (levelName = downgradeInfo.level) == null) {
            levelName = EnumC775860Uc4.NONE.getLevelName();
        }
        c775850Uc3.getClass();
        C781880Ulm.LJI = C775850Uc3.LIZ(levelName).getLevelValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isTrayAnimationBlock: ");
        sbLIZ.append(C781880Ulm.LIZIZ);
        sbLIZ.append(", isLynxAnimationBlock: ");
        sbLIZ.append(C781880Ulm.LIZJ);
        sbLIZ.append(", isTrackingBlockFirst: ");
        sbLIZ.append(C781880Ulm.LIZLLL);
        sbLIZ.append(", isTrackingBlockSecond: ");
        sbLIZ.append(C781880Ulm.LJ);
        sbLIZ.append(", isEffectBlock: ");
        sbLIZ.append(C781880Ulm.LJFF);
        sbLIZ.append(", stableLevel: ");
        sbLIZ.append(C781880Ulm.LJI);
        C20441214yg.LIZIZ("LiveAnchorGiftDowngrade", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$28(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelQuickConnect, fail, error: ");
        sbLIZ.append(obj);
        C20441214yg.LJ("MultiGuestAnchorQuickConnectViewModel", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$29(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return C0UFE.OFF;
    }

    public static final Object invoke$3(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startQuickConnect fail, error: ");
        sbLIZ.append(obj);
        C20441214yg.LJ("MultiGuestAnchorQuickConnectViewModel", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$30(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C474500IjA c474500IjA = (C474500IjA) obj;
        c474500IjA.LJJII("star_comment", "features");
        return c474500IjA;
    }

    public static final Object invoke$31(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("system_exit_live_stream_banned", "");
        return Unit.LIZ;
    }

    public static final Object invoke$32(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("user_exit_room_click_close", "");
        return Unit.LIZ;
    }

    public static final Object invoke$33(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("user_exit_room_click_close", "");
        return Unit.LIZ;
    }

    public static final Object invoke$34(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        LiveMode liveMode = (LiveMode) obj;
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        String str = liveMode.logStreamingType;
        c782710Un7.getClass();
        if (C782710Un7.LJFF == C0UX8.EVENT_PAGE_BROADCAST_PREVIEW) {
            C782710Un7.LIZLLL = str;
        }
        C197600pS.LIZ().fV1(new CommercialContentToggle());
        if (C354201Zc.LJFF(liveMode)) {
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C770220UJg.LJ(C13LE.LIZ(LeaveVideoModeVisibilityChannel.class));
        } else {
            C770220UJg c770220UJg2 = C770220UJg.LIZ;
            C770220UJg.LIZLLL(C13LE.LIZ(LeaveVideoModeVisibilityChannel.class));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        MixStreamDowngradeSetting.INSTANCE.setRequestSuccess(true);
        return Unit.LIZ;
    }

    public static final Object invoke$36(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LJIIIIZZ();
        return Unit.LIZ;
    }

    public static final Object invoke$37(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C773210UUt c773210UUt = (C773210UUt) obj;
        c773210UUt.getClass();
        if (!C773220UUu.LJIIJJI) {
            c773210UUt.LJIIJJI("system_event_start_enter_room", "");
            C773220UUu.LJIIJJI = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((C784280Upe) obj).LJ == LiveMode.LIVE_STUDIO) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$39(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        Context context = (Context) obj;
        TakoInfoModel takoInfoModel = C1852920yJm.LIZ;
        if (C703302op.LIZ(takoInfoModel.helpPageUrl)) {
            SmartRouter.buildRoute(context, UriProtector.parse("aweme://webview/").buildUpon().appendQueryParameter("url", UriProtector.parse(takoInfoModel.helpPageUrl).buildUpon().appendQueryParameter("bot_name", takoInfoModel.botName).build().toString()).build().toString()).open();
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$40(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$41(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((C784280Upe) obj).LJ == LiveMode.LIVE_MANAGER) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$42(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((C784280Upe) obj).LJ == LiveMode.LIVE_MANAGER) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$43(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            RedDotExtensionKt.LIZ(C0UX6.PLAYBOOK_UGC_GO_LIVE_ENTRANCE_DIRECT);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        C781270Ukn.LIZIZ().VI2("anchor", (C745220TLc) obj, "live_take_page", currentUserId, null);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$45(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$46(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C20441214yg.LIZIZ("LiveMatchRecordHelper", "RoomMessageAttach,record time!");
            InterfaceC980390bcT.Sa.LJFF(Long.valueOf(System.currentTimeMillis()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C784440Upu.LIZ().LIZIZ(new C0UTW(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$48(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$49(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C20441214yg.LJ("VideoBroadcastInteractionFragment", "Failed to fetch game effect list.");
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        InterfaceC774130UYh interfaceC774130UYhLJLJI;
        AbstractC1273900jFs liveCore;
        C0UYQ.LIZJ = (InterfaceC769940UIe) obj;
        if (!TTLSAvPlayerLazyLoadSwitch.INSTANCE.isAvPlayerLazyLoad()) {
            InterfaceC769940UIe interfaceC769940UIe = C0UYQ.LIZJ;
            if (interfaceC769940UIe != null && (liveCore = interfaceC769940UIe.getLiveCore()) != null) {
                interfaceC774130UYhLJLJI = liveCore.LJLJI();
            } else {
                interfaceC774130UYhLJLJI = null;
            }
            C0UYQ.LIZIZ = interfaceC774130UYhLJLJI;
            if (interfaceC774130UYhLJLJI != null) {
                interfaceC774130UYhLJLJI.setVolume(0.6f);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$50(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
        C0UFI.LJIJJ((List) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$51(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0UAK liveGoalLogHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalLogHelper();
        if (zBooleanValue) {
            liveGoalLogHelper.getClass();
            LogParams logParams = C0UFJ.LIZIZ;
            if (logParams.dragMode == 0) {
                logParams.isAdjust = 1;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$52(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((Map) obj).put("action_type", "continue_live");
        return Unit.LIZ;
    }

    public static final Object invoke$53(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((Boolean) obj).booleanValue();
        GameCast gameCast = GameCast.LIZ;
        GameCast.LIZLLL();
        DataChannelGlobal.LLILZ.zQ2(gameCast);
        return Unit.LIZ;
    }

    public static final Object invoke$54(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C773210UUt) obj).LIZJ("system_exit_restart_stream_failed", "");
        return Unit.LIZ;
    }

    public static final Object invoke$56(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(AFwS200S0000000_13.get$arr$(29));
        c06w2.Dw2(AFwS201S0000000_14.get$arr$(36));
        return Unit.LIZ;
    }

    public static final Object invoke$57(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(AFwS200S0000000_13.get$arr$(30));
        c06w2.Dw2(AFwS201S0000000_14.get$arr$(37));
        return Unit.LIZ;
    }

    public static final Object invoke$58(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(AFwS200S0000000_13.get$arr$(31));
        c06w2.Dw2(AFwS206S0000000_18.get$arr$(79));
        return Unit.LIZ;
    }

    public static final Object invoke$59(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(AFwS200S0000000_13.get$arr$(32));
        c06w2.Dw2(AFwS201S0000000_14.get$arr$(38));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        LiveStreamGoal liveStreamGoal;
        GetResponse.Data data = (GetResponse.Data) ((BaseResponse) obj).data;
        if (data == null || (liveStreamGoal = data.ongoingGoal) == null || liveStreamGoal.status == EnumC2636010g.DELETED.getCode()) {
            C0UFI.LIZ.LJIIJJI();
            InterfaceC772190UQv.W3.LJFF(new n());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$60(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C06W2) obj).Dw2(AFwS201S0000000_14.get$arr$(39));
        return Unit.LIZ;
    }

    public static final Object invoke$61(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C06W2) obj).Dw2(AFwS206S0000000_18.get$arr$(77));
        return Unit.LIZ;
    }

    public static final Object invoke$62(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C06W2) obj).Dw2(AFwS206S0000000_18.get$arr$(78));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$63(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$64(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(AFwS200S0000000_13.get$arr$(33));
        c06w2.Dw2(AFwS201S0000000_14.get$arr$(40));
        return Unit.LIZ;
    }

    public static final Object invoke$65(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean zLJFF;
        ThirdPartyAdConsentPromptModel thirdPartyAdConsentPromptModel;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        if (adPersonalitySettingsLIZIZ != null && (thirdPartyAdConsentPromptModel = adPersonalitySettingsLIZIZ.thirdPartyAdConsentPromptConfig) != null) {
            zLJFF = Intrinsics.LJFF(thirdPartyAdConsentPromptModel.shouldShowPrompt, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$66(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(AFwS200S0000000_13.get$arr$(34));
        c06w2.Dw2(AFwS201S0000000_14.get$arr$(41));
        return Unit.LIZ;
    }

    public static final Object invoke$67(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        Context context = (Context) obj;
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final Object invoke$68(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        Context context = (Context) obj;
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$69(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((Boolean) obj).booleanValue();
        return null;
    }

    public static final Object invoke$7(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C0UFI c0ufi = C0UFI.LIZ;
        String strLJII = C0UFI.LJII();
        if (strLJII != null) {
            c0ufi.LJIJJLI(strLJII);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$70(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(AFwS200S0000000_13.get$arr$(70));
        c06w2.Dw2(AFwS201S0000000_14.get$arr$(45));
        return Unit.LIZ;
    }

    public static final Object invoke$71(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(AFwS200S0000000_13.get$arr$(94));
        c06w2.Dw2(AFwS201S0000000_14.get$arr$(47));
        return Unit.LIZ;
    }

    public static final Object invoke$72(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$73(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131830645, null);
        return Unit.LIZ;
    }

    public static final Object invoke$74(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$75(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ExploreFeedCell exploreFeedCell;
        EnumC721170SQp enumC721170SQp = (EnumC721170SQp) obj;
        C0TUD c0tud = C0TUE.LIZLLL;
        if (c0tud != null && (exploreFeedCell = c0tud.LIZIZ.get()) != null) {
            exploreFeedCell.i7(c0tud.LIZ, enumC721170SQp);
            MutableLiveData<String> mutableLiveData = C720620SOm.LIZ;
            if (Intrinsics.LJFF(mutableLiveData.getValue(), c0tud.LIZ.getAid())) {
                mutableLiveData.setValue(null);
            }
        }
        C0TUE.LIZ = null;
        C0TUE.LIZIZ = null;
        C0TUE.LIZJ = null;
        C0TUE.LIZLLL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$76(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C20286614Zk.LIZ.getClass();
        if (C20286614Zk.LJFF) {
            C1483410ohn.LJLJJI().LJIILLIIL();
            C20286614Zk.LJFF = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$77(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C06W2) obj).Dw2(AFwS206S0000000_18.get$arr$(156));
        return Unit.LIZ;
    }

    public static final Object invoke$78(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C06W2) obj).Dw2(AFwS215S0000000_26.get$arr$(193));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$79(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((Boolean) obj).booleanValue();
        return "";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$8(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$80(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        User user;
        ((Boolean) obj).booleanValue();
        C766270U4b.LIZLLL(2131852995);
        C1833570xoZ.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        Long lValueOf = null;
        if ((currentUser instanceof User) && (user = (User) currentUser) != null) {
            lValueOf = Long.valueOf(user.getId());
        }
        c2344009Gk.LJ(lValueOf, "anchor_id");
        c2344009Gk.LJIIIIZZ("enter_from_page", C1833570xoZ.LIZIZ);
        c2344009Gk.LJIIIIZZ("enter_from", C1833570xoZ.LIZJ);
        c2344009Gk.LJIIIIZZ("event_page", "live_replay");
        C20684815ws.LJIILLIIL("livesdk_subscribe_highlight_inbox_toast", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$81(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return C326310Cqj.LIZ((C326310Cqj) obj, new C1623706Xj(), null, 2);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$82(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$83(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$84(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(AFwS200S0000000_13.get$arr$(166));
        c06w2.Dw2(AFwS201S0000000_14.get$arr$(297));
        return Unit.LIZ;
    }

    public static final Object invoke$85(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C06W2) obj).Dw2(AFwS201S0000000_14.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        return Unit.LIZ;
    }

    public static final Object invoke$86(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C06W2) obj).Dw2(AFwS201S0000000_14.get$arr$(301));
        return Unit.LIZ;
    }

    public static final Object invoke$87(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131850281, get$arr$(88));
        return Unit.LIZ;
    }

    public static final Object invoke$88(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$89(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        boolean z;
        if (((Reference) obj).get() == null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$9(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        LiveStreamGoal liveStreamGoal;
        C0UFI c0ufi = C0UFI.LIZ;
        GetResponse.Data data = (GetResponse.Data) ((BaseResponse) obj).data;
        if (data != null) {
            liveStreamGoal = data.ongoingGoal;
        } else {
            liveStreamGoal = null;
        }
        c0ufi.LJJ(liveStreamGoal, false);
        if (!C500260Jjc.LJJIJLIJ()) {
            List<Boolean> list = C0UFI.LJII;
            Boolean bool = Boolean.FALSE;
            list.addAll(C1697810uHb.LJIILJJIL(bool, bool, bool));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$90(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Boolean.valueOf(!((InetAddress) obj).isLoopbackAddress());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$92(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$93(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$94(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        C06W2 c06w2 = (C06W2) obj;
        c06w2.Dw2(AFwS200S0000000_13.get$arr$(195));
        c06w2.Dw2(AFwS201S0000000_14.get$arr$(336));
        return Unit.LIZ;
    }

    public static final Object invoke$95(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((C924400aAA) obj).LIZ == 4) {
            C0UC4 c0uc4 = C0UC4.LIZ;
            c0uc4.LJIIIIZZ();
            c0uc4.LJFF();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$96(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1304710k3Z.LIZ.LJII(1102, "newBeauty", null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$97(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1304710k3Z.LIZ.LJII(1101, "newBeauty", null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$98(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1304710k3Z.LIZ.LJII(1103, "", null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$99(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1304710k3Z.LIZ.LJII(1100, "", null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$100(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return obj;
    }

    public static final Object invoke$101(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return obj;
    }

    public static final Object invoke$55(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$91(AFwS245S0000000_12 aFwS245S0000000_12, Object obj) {
        return obj;
    }
}
