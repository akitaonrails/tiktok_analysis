package kotlin.jvm.internal;

import X.AbstractC2250861D8a;
import X.C06W2;
import X.C06W5;
import X.C07WG;
import X.C09AY;
import X.C0LCS;
import X.C0XQ7;
import X.C1071160dys;
import X.C1102970eoB;
import X.C1103080eoM;
import X.C1103090eoN;
import X.C1103120eoQ;
import X.C1155440gAo;
import X.C1196804mE;
import X.C11A0;
import X.C1202330hOR;
import X.C1379360lzy;
import X.C13LP;
import X.C1435510nSX;
import X.C1647230sy1;
import X.C1819740xSG;
import X.C194561119z;
import X.C1D3E;
import X.C1D3G;
import X.C1D8Z;
import X.C2250201D5m;
import X.C2256591DUb;
import X.C2256651DUh;
import X.C2267031DoL;
import X.C2267471Dp3;
import X.C2267491Dp5;
import X.C2267501Dp6;
import X.C2267521Dp8;
import X.C233800vI;
import X.C291001Au;
import X.C436440H9m;
import X.C529150Kp7;
import X.C895630ZBp;
import X.EnumC1099930ejH;
import X.InterfaceC2250961D8k;
import X.InterfaceC2257711DYj;
import X.InterfaceC2267531Dp9;
import X.InterfaceC2272941Dxs;
import X.InterfaceC738310Sxh;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionShowInfo;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.survey.SignalRule;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerState;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutState;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewState;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService;
import com.ss.android.ugc.aweme.performance.MediaUploadPerformanceMonitor;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.creation.edit.component.filter.story.StoryEditFilterIndicatorState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorState;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState;
import com.ss.android.vesdk.VECameraSettings;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AFwS283S0000000_35 extends C09AY implements Function1 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(269);
    public final int $t;

    public static AFwS283S0000000_35 get$arr$(int i) {
        AFwS283S0000000_35 aFwS283S0000000_35 = (AFwS283S0000000_35) arr$.get(i);
        if (aFwS283S0000000_35 != null) {
            return aFwS283S0000000_35;
        }
        arr$.compareAndSet(i, null, new AFwS283S0000000_35(i));
        return (AFwS283S0000000_35) arr$.get(i);
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS283S0000000_35(int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        final InterfaceC2250961D8k interfaceC2250961D8k = (InterfaceC2250961D8k) obj;
        return new AbstractC2250861D8a(interfaceC2250961D8k) { // from class: X.1D8f
            public final String toString() {
                return "New";
            }

            @Override // X.AbstractC2250861D8a, X.C1D86
            public final void start() {
                if (this.LIZ.LJIIZILJ()) {
                    InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k2 = this.LIZ;
                    interfaceC2250961D8k2.LJIILIIL(new C2250891D8d(interfaceC2250961D8k2, this));
                    this.LIZ.LJIILJJIL();
                } else {
                    InterfaceC2250961D8k<AbstractC2250861D8a> interfaceC2250961D8k3 = this.LIZ;
                    interfaceC2250961D8k3.LJIILIIL(new C2250881D8c(interfaceC2250961D8k3));
                    this.LIZ.onStart();
                }
            }
        };
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC738310Sxh) obj).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$101(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditFilterIndicatorState editFilterIndicatorState = (EditFilterIndicatorState) obj;
        return editFilterIndicatorState.copy(editFilterIndicatorState.isAutoUse, editFilterIndicatorState.isShowPrompt, editFilterIndicatorState.currentFilter, new C194561119z());
    }

    public static final Object invoke$102(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditFilterIndicatorState editFilterIndicatorState = (EditFilterIndicatorState) obj;
        return editFilterIndicatorState.copy(editFilterIndicatorState.isAutoUse, editFilterIndicatorState.isShowPrompt, editFilterIndicatorState.currentFilter, new C11A0());
    }

    public static final Object invoke$103(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, new C529150Kp7(), editToolbarState.chooseMusicText, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, editToolbarState.refresh, editToolbarState.iconAnimation, editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, editToolbarState.marginValue, editToolbarState.chooseMusicIconRes, editToolbarState.aiLiveState, editToolbarState.actionWithItemPositionEvent, editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, editToolbarState.makeItemVisibleOnCollapsed, editToolbarState.showPromote, editToolbarState.hidePromote, editToolbarState.iconRes, editToolbarState.iconColor);
    }

    public static final Object invoke$104(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditToolbarState editToolbarState = (EditToolbarState) obj;
        return editToolbarState.copy(editToolbarState.ui, editToolbarState.backVisible, editToolbarState.backTipVisible, editToolbarState.backTipText, editToolbarState.hideMoreEvent, editToolbarState.chooseMusicText, editToolbarState.chooseMusicIcon, editToolbarState.topMargin, editToolbarState.bottomHeight, new C529150Kp7(), editToolbarState.iconAnimation, editToolbarState.iconLottieAnimation, editToolbarState.autoEnhanceStatus, editToolbarState.marginValue, editToolbarState.chooseMusicIconRes, editToolbarState.aiLiveState, editToolbarState.actionWithItemPositionEvent, editToolbarState.aiCaptionOn, editToolbarState.soundSyncOn, editToolbarState.livePhotoPreviewMode, editToolbarState.makeItemVisibleOnCollapsed, editToolbarState.showPromote, editToolbarState.hidePromote, editToolbarState.iconRes, editToolbarState.iconColor);
    }

    public static final Object invoke$105(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C1819740xSG.LIZ((C1819740xSG) obj, false, false, true, 3);
    }

    public static final Object invoke$106(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C1819740xSG.LIZ((C1819740xSG) obj, true, false, false, 6);
    }

    public static final Object invoke$107(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C1819740xSG.LIZ((C1819740xSG) obj, false, true, false, 5);
    }

    public static final Object invoke$108(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$109(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, new C291001Au<>(Unit.LIZ), myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$11(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC738310Sxh) obj).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$110(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, Boolean.FALSE);
    }

    public static final Object invoke$111(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(true, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$112(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, true, null, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$114(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        obj.getClass();
        return new C1155440gAo(true);
    }

    public static final Object invoke$115(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        obj.getClass();
        return new C1155440gAo(false);
    }

    public static final Object invoke$116(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C06W5 c06w5LJIIJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c06w5LJIIJ = iMFoundationBridgeApiLIZ.LJIIJ()) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c06w5LJIIJ, 174));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$117(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1202330hOR c1202330hORLJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c1202330hORLJ = iMFoundationBridgeApiLIZ.LJ(R.attr.zm, R.attr.zm)) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c1202330hORLJ, 176));
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$118(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return null;
    }

    public static final Object invoke$119(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        Video video;
        Aweme aweme = (Aweme) ((C1196804mE) obj).LIZ(Aweme.class);
        if (aweme != null && (video = aweme.getVideo()) != null) {
            return Integer.valueOf(video.getDuration());
        }
        return null;
    }

    public static final Object invoke$12(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC738310Sxh) obj).LJFF();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$120(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$121(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Boolean.valueOf(((InterfaceC2272941Dxs) obj).LLLLLL());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$122(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$123(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((SessionShowInfo) obj).clickSession != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$124(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((SessionShowInfo) obj).openPageSession != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$125(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((SessionShowInfo) obj).openSearchDetailSession != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$126(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((SessionShowInfo) obj).otherClickSession != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$127(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((SessionShowInfo) obj).playSession != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$128(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        SessionInfo sessionInfo = (SessionInfo) obj;
        SessionShowInfo sessionShowInfo = sessionInfo.showSession;
        if (sessionShowInfo != null) {
            return new Pair(sessionInfo, sessionShowInfo);
        }
        return null;
    }

    public static final Object invoke$129(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((SessionInfo) obj).showSession != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$13(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC738310Sxh) obj).LIZIZ();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$130(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$131(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        String str = (String) obj;
        C1435510nSX c1435510nSX = C2256591DUb.LIZIZ;
        if (c1435510nSX != null) {
            c1435510nSX.LIZ();
        }
        C2256651DUh c2256651DUh = (C2256651DUh) MediaUploadPerformanceMonitor.LIZIZ.LIZ(str);
        c2256651DUh.LJ(true);
        c2256651DUh.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$132(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1647230sy1 c1647230sy1 = (C1647230sy1) obj;
        c1647230sy1.LIZJ = true;
        c1647230sy1.LIZLLL = true;
        return Unit.LIZ;
    }

    public static final Object invoke$133(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1647230sy1 c1647230sy1 = (C1647230sy1) obj;
        c1647230sy1.LIZJ = true;
        c1647230sy1.LIZLLL = true;
        return Unit.LIZ;
    }

    public static final Object invoke$134(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        C2267491Dp5.LIZ(c2267501Dp6.LIZLLL, c2267501Dp6.LIZJ.LIZIZ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LJFF, c2267501Dp6.LIZJ.LIZLLL, 0.0f, 6);
        C2267471Dp3.LIZ(c2267501Dp6.LJI, c2267501Dp6.LIZJ.LJ, 34, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$135(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, C1D3E.CLIENT_SIGNAL_NAME_CLICK_SHARE.getValue()));
    }

    public static final Object invoke$136(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C1D3G.LIZ((SignalRule) obj, get$arr$(135));
    }

    public static final Object invoke$137(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C1D3G.LIZ((SignalRule) obj, get$arr$(143));
    }

    public static final Object invoke$138(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C1D3G.LIZ((SignalRule) obj, get$arr$(144));
    }

    public static final Object invoke$139(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C1D3G.LIZ((SignalRule) obj, get$arr$(145));
    }

    public static final Object invoke$14(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC738310Sxh) obj).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$140(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C1D3G.LIZ((SignalRule) obj, get$arr$(146));
    }

    public static final Object invoke$141(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C1D3G.LIZ((SignalRule) obj, get$arr$(147));
    }

    public static final Object invoke$142(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C1D3G.LIZ((SignalRule) obj, get$arr$(148));
    }

    public static final Object invoke$143(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, C1D3E.CLIENT_SIGNAL_NAME_CLICK_LIKE.getValue()));
    }

    public static final Object invoke$144(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, C1D3E.CLIENT_SIGNAL_NAME_CLICK_FAVORITE.getValue()));
    }

    public static final Object invoke$145(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, C1D3E.CLIENT_SIGNAL_NAME_CLICK_FOLLOW.getValue()));
    }

    public static final Object invoke$146(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, C1D3E.CLIENT_SIGNAL_NAME_CLICK_PROFILE.getValue()));
    }

    public static final Object invoke$147(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, C1D3E.CLIENT_SIGNAL_NAME_CLICK_COMMENT.getValue()));
    }

    public static final Object invoke$148(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, C1D3E.CLIENT_SIGNAL_NAME_VIDEO_PLAY_FINISH.getValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Dq3] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0iVE] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Zj8] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Zjd] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zjc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$149(kotlin.jvm.internal.AFwS283S0000000_35 r3, java.lang.Object r4) {
        /*
            X.1Dq2 r4 = (X.InterfaceC2268081Dq2) r4
            X.1Dq3 r0 = new X.1Dq3
            r0.<init>()
            r4.LJ(r0)
            X.0I0B r3 = X.C0I0B.LJFF
            r3.LIZJ()
            boolean r0 = X.C894660Z7w.LIZJ()
            if (r0 != 0) goto L49
            r3.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 != 0) goto L49
            r0 = 0
        L1f:
            r4.LIZLLL(r0)
            X.0iVE r0 = new X.0iVE
            r0.<init>()
            r4.LIZIZ(r0)
            X.0Zj8 r0 = new X.0Zj8
            r0.<init>()
            r4.LIZJ(r0)
            X.0Zjc r2 = new X.0Zjc
            X.0Zjd r1 = new X.0Zjd
            r1.<init>()
            r3.LIZJ()
            android.content.Context r0 = X.C894660Z7w.LIZ()
            r2.<init>(r1, r0)
            r4.LIZ(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L49:
            r0 = 1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS283S0000000_35.invoke$149(kotlin.jvm.internal.AFwS283S0000000_35, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$15(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((VECameraSettings.Builder) obj).setDefaultZoomUsingZoomV2(true);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$150(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$151(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, false, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$152(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(true, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$153(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, true, null, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$154(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, true, null, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$155(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, Boolean.FALSE, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$156(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, false, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$157(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, true, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$158(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, false, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$159(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, false, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$16(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        int accountType;
        User curUser;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser = iAccountUserServiceLJFF.getCurUser()) != null) {
            accountType = curUser.getAccountType();
        } else {
            accountType = 0;
        }
        return Integer.valueOf(accountType);
    }

    public static final Object invoke$160(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, false, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$161(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, false, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$162(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$163(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, false, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$164(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(true, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$165(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1647230sy1 c1647230sy1 = (C1647230sy1) obj;
        c1647230sy1.LIZJ = true;
        c1647230sy1.LIZLLL = true;
        return Unit.LIZ;
    }

    public static final Object invoke$166(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, false, false, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$167(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, false, false, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$168(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, false, false, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$169(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(myProfileGuideState.hasGuideShowed, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, myProfileGuideState.needShowArtistNewReleaseNotice, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, false, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$17(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        int promotePayType;
        User curUser;
        CommerceUserInfo commerceUserInfo;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser = iAccountUserServiceLJFF.getCurUser()) != null && (commerceUserInfo = curUser.getCommerceUserInfo()) != null) {
            promotePayType = commerceUserInfo.getPromotePayType();
        } else {
            promotePayType = 0;
        }
        return Integer.valueOf(promotePayType);
    }

    public static final Object invoke$170(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1071160dys c1071160dys = (C1071160dys) obj;
        c1071160dys.LIZ = "notification_page";
        c1071160dys.LIZIZ = "follow";
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$172(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$173(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$174(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        Aweme aweme = (Aweme) ((C1196804mE) obj).LIZ(Aweme.class);
        if (aweme != null) {
            return aweme.getAid();
        }
        return null;
    }

    public static final Object invoke$175(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        Video video;
        Aweme aweme = (Aweme) ((C1196804mE) obj).LIZ(Aweme.class);
        if (aweme != null && (video = aweme.getVideo()) != null) {
            return Integer.valueOf(video.getVideoLength());
        }
        return null;
    }

    public static final Object invoke$176(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((Character) obj).charValue() == 'd') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$177(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        char cCharValue = ((Character) obj).charValue();
        if (cCharValue != 'k' && cCharValue != 'K' && cCharValue != 'h' && cCharValue != 'H') {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$178(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((Character) obj).charValue() == 'm') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$179(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((Character) obj).charValue() == 'a') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$18(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1196804mE c1196804mE = (C1196804mE) obj;
        Integer numValueOf = null;
        if (c1196804mE.LIZ(Aweme.class) == null) {
            return null;
        }
        List<Integer> list = C1379360lzy.LIZLLL;
        Aweme aweme = (Aweme) c1196804mE.LIZ(Aweme.class);
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getHasPromoteEntry());
        }
        if (C13LP.LJJJJ(numValueOf, list)) {
            return 1;
        }
        return 0;
    }

    public static final Object invoke$180(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        char cCharValue = ((Character) obj).charValue();
        if (cCharValue != 'k' && cCharValue != 'K' && cCharValue != 'h' && cCharValue != 'H') {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$181(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((Character) obj).charValue() == 'm') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$182(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        char cCharValue = ((Character) obj).charValue();
        if (cCharValue != 'k' && cCharValue != 'K' && cCharValue != 'h' && cCharValue != 'H') {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$183(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((Character) obj).charValue() == 'm') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$184(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((Character) obj).charValue() == 'y') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$185(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        char cCharValue = ((Character) obj).charValue();
        if (cCharValue != 'L' && cCharValue != 'M') {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$186(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        boolean z;
        if (((Character) obj).charValue() == 'd') {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$187(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        float f = 16;
        C2267471Dp3.LIZ(c2267501Dp6.LJ, c2267501Dp6.LIZJ.LIZJ, f, 4);
        C2267471Dp3.LIZ(c2267501Dp6.LJI, c2267501Dp6.LIZJ.LJ, f, 4);
        return Unit.LIZ;
    }

    public static final Object invoke$188(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        C2267491Dp5.LIZ(c2267501Dp6.LIZLLL, c2267501Dp6.LIZJ.LIZIZ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LJFF, c2267501Dp6.LIZJ.LIZLLL, 0.0f, 6);
        C2267471Dp3.LIZ(c2267501Dp6.LJ, c2267501Dp6.LIZJ.LIZJ, 0.0f, 6);
        C2267471Dp3.LIZ(c2267501Dp6.LJI, c2267501Dp6.LIZJ.LJ, 0.0f, 6);
        InterfaceC2267531Dp9.LIZ.getClass();
        c2267501Dp6.LIZJ(C2267521Dp8.LIZ());
        return Unit.LIZ;
    }

    public static final Object invoke$189(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        C2267491Dp5.LIZ(c2267501Dp6.LIZLLL, c2267501Dp6.LIZJ.LIZIZ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LJFF, c2267501Dp6.LIZJ.LIZLLL, 0.0f, 6);
        C2267471Dp3.LIZ(c2267501Dp6.LJ, c2267501Dp6.LIZJ.LIZJ, 0.0f, 6);
        C2267471Dp3.LIZ(c2267501Dp6.LJI, c2267501Dp6.LIZJ.LJ, 0.0f, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1196804mE c1196804mE = (C1196804mE) obj;
        if (c1196804mE.LIZ(Aweme.class) == null) {
            return null;
        }
        Aweme aweme = (Aweme) c1196804mE.LIZ(Aweme.class);
        if (aweme != null && aweme.getAwemeType() == 150) {
            return "photo";
        }
        return "video";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$190(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$191(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        Object obj2 = C2267031DoL.LJIIIIZZ;
        C2267031DoL c2267031DoL = new C2267031DoL();
        c2267031DoL.LJ = obj2;
        c2267031DoL.LJFF = true;
        return c2267031DoL;
    }

    public static final Object invoke$192(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C2267031DoL.LIZ();
    }

    public static final Object invoke$193(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        obj.getClass();
        return new C1155440gAo(false);
    }

    public static final Object invoke$194(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        obj.getClass();
        return new C1155440gAo(false);
    }

    public static final Object invoke$195(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, new C291001Au<>(3), profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$196(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, Boolean.TRUE, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, profileState.needRefreshAwemeListEvent, profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final Object invoke$197(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ProfileState profileState = (ProfileState) obj;
        return profileState.copy(profileState.uid, profileState.suid, profileState.user, profileState.sourceAweme, profileState.loadAvatar, profileState.avatarClickCount, profileState.curTabType, profileState.userVisibleHint, profileState.needUpdateAvatarUrl, profileState.livePreviousPage, profileState.isFromMain, profileState.isFirstNodeShow, profileState.enterFrom, profileState.isPostGuideShow, profileState.isPostAwemeEmpty, profileState.isPostAndDraftEmpty, profileState.isGuideUserCard, profileState.isPublishTabEmpty, profileState.isPostAwemeEmptyWhenPrivateShow, profileState.needShowProfileCollectionGuide, profileState.triggerCopyrightViolationSnackBarEvent, profileState.isAvatarClicked, profileState.isBackgroundCoverClicked, profileState.currentDownloadSetting, profileState.onHiddenChanged, profileState.fromSearch, profileState.shouldShowViewerEntranceTips, profileState.shouldShowViewerDialog, profileState.guideCardOnDisplay, profileState.isBlankWorkShow, profileState.aigcNavMetadata, profileState.targetTab, new C291001Au<>(Unit.LIZ), profileState.needRefreshPhotoModeAwemeMuteEvent, profileState.photoTopicProfileBannerEvent, profileState.csiBanner, profileState.guideCreateVideoWithEffectModel, profileState.isBottomBannerCheckComplete, profileState.publishAwemeRefreshed, profileState.isRefreshing, profileState.isLocating);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$198(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$199(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hvi);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        final InterfaceC2250961D8k interfaceC2250961D8k = (InterfaceC2250961D8k) obj;
        return new C1D8Z(interfaceC2250961D8k) { // from class: X.1D8Y
            public final String toString() {
                return "New";
            }

            @Override // X.C1D8Z, X.C1D86
            public final void start() {
                InterfaceC2250961D8k<C1D8Z> interfaceC2250961D8k2 = this.LIZ;
                interfaceC2250961D8k2.LJIILIIL(new C1D8V(interfaceC2250961D8k2));
                this.LIZ.onStart();
            }
        };
    }

    public static final Object invoke$20(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        Aweme aweme = (Aweme) ((C1196804mE) obj).LIZ(Aweme.class);
        if (aweme != null) {
            return aweme.getPromoteToastKey();
        }
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$200(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$201(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$202(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hvh);
        return Unit.LIZ;
    }

    public static final Object invoke$203(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw9);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$204(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$205(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$206(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hvd);
        return Unit.LIZ;
    }

    public static final Object invoke$207(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw_);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$208(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$209(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$21(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        PromoteModel promoteModel;
        Aweme aweme = (Aweme) ((C1196804mE) obj).LIZ(Aweme.class);
        if (aweme != null && (promoteModel = aweme.getPromoteModel()) != null) {
            return promoteModel.getExtra();
        }
        return null;
    }

    public static final Object invoke$210(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hve);
        return Unit.LIZ;
    }

    public static final Object invoke$211(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw9);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$212(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$213(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$214(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1103090eoN c1103090eoN = (C1103090eoN) obj;
        c1103090eoN.LIZ(EnumC1099930ejH.ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(201)), C1103080eoM.LIZJ(get$arr$(203))));
        c1103090eoN.LIZ(EnumC1099930ejH.ICON_WITH_TEXT, new C1102970eoB(C1103080eoM.LIZ(get$arr$(205)), C1103080eoM.LIZJ(get$arr$(207))));
        c1103090eoN.LIZ(EnumC1099930ejH.LANDSCAPE_ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(209)), C1103080eoM.LIZJ(get$arr$(211))));
        return Unit.LIZ;
    }

    public static final Object invoke$215(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1103090eoN c1103090eoN = (C1103090eoN) obj;
        c1103090eoN.LIZ(EnumC1099930ejH.ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(225)), C1103080eoM.LIZJ(get$arr$(227))));
        c1103090eoN.LIZ(EnumC1099930ejH.ICON_WITH_TEXT, new C1102970eoB(C1103080eoM.LIZ(get$arr$(229)), C1103080eoM.LIZJ(get$arr$(231))));
        c1103090eoN.LIZ(EnumC1099930ejH.LANDSCAPE_ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(233)), C1103080eoM.LIZJ(get$arr$(234))));
        return Unit.LIZ;
    }

    public static final Object invoke$216(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1103090eoN c1103090eoN = (C1103090eoN) obj;
        c1103090eoN.LIZ(EnumC1099930ejH.ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(235)), C1103080eoM.LIZJ(get$arr$(237))));
        c1103090eoN.LIZ(EnumC1099930ejH.ICON_WITH_TEXT, new C1102970eoB(C1103080eoM.LIZ(get$arr$(239)), C1103080eoM.LIZJ(get$arr$(242))));
        c1103090eoN.LIZ(EnumC1099930ejH.LANDSCAPE_ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(245)), C1103080eoM.LIZJ(get$arr$(249))));
        return Unit.LIZ;
    }

    public static final Object invoke$217(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1103090eoN c1103090eoN = (C1103090eoN) obj;
        c1103090eoN.LIZ(EnumC1099930ejH.ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(241)), C1103080eoM.LIZJ(get$arr$(244))));
        c1103090eoN.LIZ(EnumC1099930ejH.ICON_WITH_TEXT, new C1102970eoB(C1103080eoM.LIZ(get$arr$(248)), C1103080eoM.LIZJ(get$arr$(252))));
        c1103090eoN.LIZ(EnumC1099930ejH.LANDSCAPE_ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(254)), C1103080eoM.LIZJ(get$arr$(256))));
        return Unit.LIZ;
    }

    public static final Object invoke$218(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1103090eoN c1103090eoN = (C1103090eoN) obj;
        c1103090eoN.LIZ(EnumC1099930ejH.ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(212)), C1103080eoM.LIZJ(get$arr$(223))));
        c1103090eoN.LIZ(EnumC1099930ejH.ICON_WITH_TEXT, new C1102970eoB(C1103080eoM.LIZ(get$arr$(226)), C1103080eoM.LIZJ(get$arr$(228))));
        c1103090eoN.LIZ(EnumC1099930ejH.LANDSCAPE_ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(230)), C1103080eoM.LIZJ(get$arr$(232))));
        return Unit.LIZ;
    }

    public static final Object invoke$219(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1103090eoN c1103090eoN = (C1103090eoN) obj;
        c1103090eoN.LIZ(EnumC1099930ejH.ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(246)), C1103080eoM.LIZJ(get$arr$(250))));
        c1103090eoN.LIZ(EnumC1099930ejH.ICON_WITH_TEXT, new C1102970eoB(C1103080eoM.LIZ(get$arr$(253)), C1103080eoM.LIZJ(get$arr$(255))));
        c1103090eoN.LIZ(EnumC1099930ejH.LANDSCAPE_ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(257)), C1103080eoM.LIZJ(get$arr$(259))));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$22(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$220(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1103090eoN c1103090eoN = (C1103090eoN) obj;
        c1103090eoN.LIZ(EnumC1099930ejH.ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(258)), C1103080eoM.LIZJ(get$arr$(260))));
        c1103090eoN.LIZ(EnumC1099930ejH.ICON_WITH_TEXT, new C1102970eoB(C1103080eoM.LIZ(get$arr$(261)), C1103080eoM.LIZJ(get$arr$(199))));
        c1103090eoN.LIZ(EnumC1099930ejH.LANDSCAPE_ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(200)), C1103080eoM.LIZJ(get$arr$(202))));
        return Unit.LIZ;
    }

    public static final Object invoke$221(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1103090eoN c1103090eoN = (C1103090eoN) obj;
        c1103090eoN.LIZ(EnumC1099930ejH.ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(204)), C1103080eoM.LIZJ(get$arr$(206))));
        c1103090eoN.LIZ(EnumC1099930ejH.ICON_WITH_TEXT, new C1102970eoB(C1103080eoM.LIZ(get$arr$(208)), C1103080eoM.LIZJ(get$arr$(210))));
        c1103090eoN.LIZ(EnumC1099930ejH.LANDSCAPE_ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(213)), C1103080eoM.LIZJ(get$arr$(224))));
        return Unit.LIZ;
    }

    public static final Object invoke$222(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1103090eoN c1103090eoN = (C1103090eoN) obj;
        c1103090eoN.LIZ(EnumC1099930ejH.ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(236)), C1103080eoM.LIZJ(get$arr$(238))));
        c1103090eoN.LIZ(EnumC1099930ejH.ICON_WITH_TEXT, new C1102970eoB(C1103080eoM.LIZ(get$arr$(240)), C1103080eoM.LIZJ(get$arr$(243))));
        c1103090eoN.LIZ(EnumC1099930ejH.LANDSCAPE_ICON, new C1102970eoB(C1103080eoM.LIZ(get$arr$(247)), C1103080eoM.LIZJ(get$arr$(251))));
        return Unit.LIZ;
    }

    public static final Object invoke$223(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.h5h);
        return Unit.LIZ;
    }

    public static final Object invoke$224(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hvd);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$225(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$226(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$227(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw5);
        return Unit.LIZ;
    }

    public static final Object invoke$228(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.h5h);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$229(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$230(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$231(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw6);
        return Unit.LIZ;
    }

    public static final Object invoke$232(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.h5h);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$233(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$234(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw5);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$235(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$236(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$237(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw2);
        return Unit.LIZ;
    }

    public static final Object invoke$238(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hvf);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$239(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$240(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$241(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$242(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw3);
        return Unit.LIZ;
    }

    public static final Object invoke$243(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hvg);
        return Unit.LIZ;
    }

    public static final Object invoke$244(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hwd);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$245(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$246(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$247(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$248(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$249(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw2);
        return Unit.LIZ;
    }

    public static final Object invoke$250(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw0);
        return Unit.LIZ;
    }

    public static final Object invoke$251(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hvf);
        return Unit.LIZ;
    }

    public static final Object invoke$252(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hwf);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$253(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$254(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$255(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw0);
        return Unit.LIZ;
    }

    public static final Object invoke$256(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hwe);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$257(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$258(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$259(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hw0);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC2257711DYj) obj).onCreate();
        return Unit.LIZ;
    }

    public static final Object invoke$260(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((C1103120eoQ) obj).LIZ = Integer.valueOf(R.layout.hvh);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$261(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$262(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$263(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$264(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$265(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1071160dys c1071160dys = (C1071160dys) obj;
        c1071160dys.LIZ = "others_homepage";
        c1071160dys.LIZIZ = "follow";
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$266(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$267(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1071160dys c1071160dys = (C1071160dys) obj;
        c1071160dys.LIZ = "notification_page";
        c1071160dys.LIZIZ = "follow";
        return Unit.LIZ;
    }

    public static final Object invoke$268(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return myProfileGuideState.copy(false, myProfileGuideState.postListHasLoaded, myProfileGuideState.avatarHasLoaded, myProfileGuideState.hasSurveyDetermined, myProfileGuideState.surveyData, myProfileGuideState.needShowDiskManagerGuide, myProfileGuideState.currentDownloadSetting, myProfileGuideState.vcdGuideLoaded, myProfileGuideState.hasPermissionPopUp, myProfileGuideState.needShowBindPhoneNumberNotice, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.needShowEmailPopUp, myProfileGuideState.needPromptEmailAndPhoneBind, myProfileGuideState.needShowSaveLoginInfoPopUp, false, myProfileGuideState.needShowMusicOfflineNotice, myProfileGuideState.needShowSyncNicknameUsername, myProfileGuideState.needShowProfileHVAPopUp, myProfileGuideState.needShowProfileWalletPopUp, myProfileGuideState.needShowPasskey, myProfileGuideState.needShowSmartLockService, myProfileGuideState.needShowPopSuitePopup, myProfileGuideState.needShowFanSpotlightGuide, myProfileGuideState.needShow3PBindingPopUp, myProfileGuideState.needShowProfileBindingPromptBottomBanner, myProfileGuideState.needShowIncentivePostPopUp, myProfileGuideState.waitingOutreachBanner, myProfileGuideState.needShowOutreachBanner, myProfileGuideState.isPostAndDraftEmpty);
    }

    public static final Object invoke$27(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC2257711DYj) obj).onDestroy();
        return Unit.LIZ;
    }

    public static final Object invoke$28(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC2257711DYj) obj).onPause();
        return Unit.LIZ;
    }

    public static final Object invoke$29(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC2257711DYj) obj).onResume();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$30(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC2257711DYj) obj).onStop();
        return Unit.LIZ;
    }

    public static final Object invoke$31(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("entrance_name", "bonus");
        laneParams.plusAssign("entrance_to", "bonus_center");
        return Unit.LIZ;
    }

    public static final Object invoke$33(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C06W5 c06w5LJIIJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c06w5LJIIJ = iMFoundationBridgeApiLIZ.LJIIJ()) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c06w5LJIIJ, 128));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1202330hOR c1202330hORLJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c1202330hORLJ = iMFoundationBridgeApiLIZ.LJ(R.attr.zp, R.attr.zp)) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c1202330hORLJ, 129));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1071160dys c1071160dys = (C1071160dys) obj;
        c1071160dys.LIZ = "homepage_friends";
        c1071160dys.LIZIZ = "auto";
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Boolean.valueOf(((List) C2250201D5m.LJII.getValue()).contains(obj.getClass().getName()));
    }

    public static final Object invoke$40(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        FTCEditCornerState fTCEditCornerState = (FTCEditCornerState) obj;
        return fTCEditCornerState.copy(fTCEditCornerState.cornerVisible, fTCEditCornerState.topMargin, fTCEditCornerState.bottomMargin, new C11A0());
    }

    public static final Object invoke$41(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        FTCEditMusicCutState fTCEditMusicCutState = (FTCEditMusicCutState) obj;
        return fTCEditMusicCutState.copy(fTCEditMusicCutState.musicWaveData, fTCEditMusicCutState.videoLength, new C11A0());
    }

    public static final Object invoke$42(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        FTCEditStickerState fTCEditStickerState = (FTCEditStickerState) obj;
        return fTCEditStickerState.copy(fTCEditStickerState.ui, fTCEditStickerState.pollTextAnimEvent, fTCEditStickerState.pollTextLayoutEvent, fTCEditStickerState.viewRenderStickerVisibleEvent, fTCEditStickerState.videoLengthUpdateEvent, new C529150Kp7(), fTCEditStickerState.updateStickerTime);
    }

    public static final Object invoke$43(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        FTCEditStickerState fTCEditStickerState = (FTCEditStickerState) obj;
        return fTCEditStickerState.copy(new C11A0(), fTCEditStickerState.pollTextAnimEvent, fTCEditStickerState.pollTextLayoutEvent, fTCEditStickerState.viewRenderStickerVisibleEvent, fTCEditStickerState.videoLengthUpdateEvent, fTCEditStickerState.refreshVideoSource, fTCEditStickerState.updateStickerTime);
    }

    public static final Object invoke$44(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        FTCEditToolbarState fTCEditToolbarState = (FTCEditToolbarState) obj;
        return fTCEditToolbarState.copy(fTCEditToolbarState.ui, fTCEditToolbarState.backVisible, fTCEditToolbarState.backTipVisible, fTCEditToolbarState.backTipText, fTCEditToolbarState.titleBarItems, fTCEditToolbarState.bottomBarItems, new C529150Kp7(), fTCEditToolbarState.chooseMusicText, fTCEditToolbarState.chooseMusicIcon, fTCEditToolbarState.topMargin, fTCEditToolbarState.bottomHeight, fTCEditToolbarState.chooseMusicRawIconRes);
    }

    public static final Object invoke$45(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C06W5 c06w5LJIIJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c06w5LJIIJ = iMFoundationBridgeApiLIZ.LJIIJ()) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c06w5LJIIJ, 132));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1202330hOR c1202330hORLJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c1202330hORLJ = iMFoundationBridgeApiLIZ.LJ(R.attr.zm, R.attr.zm)) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c1202330hORLJ, 133));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJIIJ();
        return Boolean.FALSE;
    }

    public static final Object invoke$48(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJI();
        return Boolean.FALSE;
    }

    public static final Object invoke$49(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJIIIZ();
        return Boolean.FALSE;
    }

    public static final Object invoke$5(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("entrance_name", "bonus");
        laneParams.plusAssign("entrance_to", "bonus_center");
        laneParams.plusAssign("entrance_status", "normal");
        return Unit.LIZ;
    }

    public static final Object invoke$50(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJIILJJIL();
        return Boolean.FALSE;
    }

    public static final Object invoke$51(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJIIJJI();
        return Boolean.FALSE;
    }

    public static final Object invoke$52(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJII();
        return Boolean.FALSE;
    }

    public static final Object invoke$53(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJIILIIL();
        return Boolean.FALSE;
    }

    public static final Object invoke$54(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJIJJ();
        return Boolean.FALSE;
    }

    public static final Object invoke$55(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJIIIIZZ();
        return Boolean.FALSE;
    }

    public static final Object invoke$56(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJFF();
        return Boolean.FALSE;
    }

    public static final Object invoke$57(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LJJIFFI();
        return false;
    }

    public static final Object invoke$58(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((IDmToolsDebugService) obj).LIZJ();
        return Boolean.FALSE;
    }

    public static final Object invoke$59(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1647230sy1 c1647230sy1 = (C1647230sy1) obj;
        c1647230sy1.LIZJ = true;
        c1647230sy1.LIZLLL = true;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("entrance_name", "bonus");
        laneParams.plusAssign("entrance_to", "bonus_center");
        laneParams.plusAssign("entrance_status", "normal");
        return Unit.LIZ;
    }

    public static final Object invoke$60(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, new C529150Kp7(), editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$61(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, new C529150Kp7(), editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$62(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, new C0LCS<>(Unit.LIZ), editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$63(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, new C529150Kp7(), editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$64(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, new C529150Kp7(), editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$65(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, new C529150Kp7(), editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$66(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(new C11A0(), editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$67(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, new C529150Kp7(), editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$68(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, new C529150Kp7(), editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$69(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(new C194561119z(), editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$7(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("entrance_name", "bonus");
        laneParams.plusAssign("entrance_to", "bonus_center");
        laneParams.plusAssign("entrance_status", "normal");
        return Unit.LIZ;
    }

    public static final Object invoke$70(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, new C529150Kp7(), editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$71(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, new C529150Kp7(), editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$72(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, new C529150Kp7(), editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$73(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, editTextStickerViewState.reloadStickerEvent, editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, new C529150Kp7(), editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$74(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        EditTextStickerViewState editTextStickerViewState = (EditTextStickerViewState) obj;
        return editTextStickerViewState.copy(editTextStickerViewState.ui, editTextStickerViewState.inTimeEditView, editTextStickerViewState.sticker2Top, editTextStickerViewState.dismissHitText, editTextStickerViewState.addSticker, editTextStickerViewState.guideListener, new C529150Kp7(), editTextStickerViewState.changeToTopListener, editTextStickerViewState.textStickerEditListener, editTextStickerViewState.timeClickListener, editTextStickerViewState.readTextClickListener, editTextStickerViewState.addGuidanceStickerIfNeed, editTextStickerViewState.targetCanvasSize, editTextStickerViewState.showInputView, editTextStickerViewState.editTextSticker, editTextStickerViewState.removeAllStickerEvent, editTextStickerViewState.updateLayoutSizeEvent, editTextStickerViewState.guideViewVisibility, editTextStickerViewState.resetGuideViewVisibilityEvent, editTextStickerViewState.forceHideReadItemEvent, editTextStickerViewState.goReadTextStickerScene, editTextStickerViewState.cancelNewStickerRead, editTextStickerViewState.fakeTextDataAndRead, editTextStickerViewState.getNowStringGoToReadWithFake, editTextStickerViewState.changeTextEditPageReadIcon, editTextStickerViewState.afterChangeTextAutoRead, editTextStickerViewState.mobClickTextReadingEvent, editTextStickerViewState.muteReadText, editTextStickerViewState.enableDirectEditEvent, editTextStickerViewState.addTextChangeListenerEvent, editTextStickerViewState.addTextStickerViaString, editTextStickerViewState.removeTextSticker, editTextStickerViewState.updateStickerTime, editTextStickerViewState.removeGuidanceText, editTextStickerViewState.registerTimeEditRefreshListener, editTextStickerViewState.unRegisterTimeEditRefreshListener, editTextStickerViewState.removeAllTextSticker, editTextStickerViewState.videoPlayState);
    }

    public static final Object invoke$75(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C291001Au c291001Au = new C291001Au(Unit.LIZ);
        obj.getClass();
        return new C233800vI(c291001Au);
    }

    public static final Object invoke$76(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C291001Au c291001Au = new C291001Au(Unit.LIZ);
        obj.getClass();
        return new C233800vI(c291001Au);
    }

    public static final Object invoke$77(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1202330hOR c1202330hORLJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c1202330hORLJ = iMFoundationBridgeApiLIZ.LJ(R.attr.zm, R.attr.zm)) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c1202330hORLJ, 137));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$78(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C06W5 c06w5LJIIJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c06w5LJIIJ = iMFoundationBridgeApiLIZ.LJIIJ()) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c06w5LJIIJ, 138));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$79(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1202330hOR c1202330hORLJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c1202330hORLJ = iMFoundationBridgeApiLIZ.LJ(R.attr.zm, R.attr.zm)) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c1202330hORLJ, 139));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("entrance_name", "bonus");
        laneParams.plusAssign("entrance_to", "bonus_center");
        laneParams.plusAssign("entrance_status", "normal");
        return Unit.LIZ;
    }

    public static final Object invoke$82(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C06W5 c06w5LJIIJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c06w5LJIIJ = iMFoundationBridgeApiLIZ.LJIIJ()) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c06w5LJIIJ, 153));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$83(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1202330hOR c1202330hORLJ;
        C06W2 c06w2 = (C06W2) obj;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null && (c1202330hORLJ = iMFoundationBridgeApiLIZ.LJ(R.attr.zm, R.attr.zm)) != null) {
            c06w2.Dw2(new AwS579S0100000_35(c1202330hORLJ, 154));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$84(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return Boolean.TRUE;
    }

    public static final Object invoke$85(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1647230sy1 c1647230sy1 = (C1647230sy1) obj;
        c1647230sy1.LIZJ = true;
        c1647230sy1.LIZLLL = true;
        return Unit.LIZ;
    }

    public static final Object invoke$86(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1647230sy1 c1647230sy1 = (C1647230sy1) obj;
        c1647230sy1.LIZJ = true;
        c1647230sy1.LIZLLL = true;
        return Unit.LIZ;
    }

    public static final Object invoke$87(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        obj.getClass();
        return new C07WG(false);
    }

    public static final Object invoke$88(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        obj.getClass();
        return new C07WG(true);
    }

    public static final Object invoke$89(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1647230sy1 c1647230sy1 = (C1647230sy1) obj;
        c1647230sy1.LIZJ = true;
        c1647230sy1.LIZLLL = true;
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        ((InterfaceC738310Sxh) obj).LJFF();
        return Unit.LIZ;
    }

    public static final Object invoke$90(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C436440H9m.LIZ((C436440H9m) obj, false, 0, 6);
    }

    public static final Object invoke$91(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return C436440H9m.LIZ((C436440H9m) obj, true, 0, 6);
    }

    public static final Object invoke$92(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        StoryEditFilterIndicatorState storyEditFilterIndicatorState = (StoryEditFilterIndicatorState) obj;
        return storyEditFilterIndicatorState.copy(storyEditFilterIndicatorState.isAutoUse, storyEditFilterIndicatorState.isShowPrompt, storyEditFilterIndicatorState.currentFilter, new C194561119z());
    }

    public static final Object invoke$93(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        StoryEditFilterIndicatorState storyEditFilterIndicatorState = (StoryEditFilterIndicatorState) obj;
        return storyEditFilterIndicatorState.copy(storyEditFilterIndicatorState.isAutoUse, storyEditFilterIndicatorState.isShowPrompt, storyEditFilterIndicatorState.currentFilter, new C11A0());
    }

    public static final Object invoke$94(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        C2267471Dp3.LIZ(c2267501Dp6.LJ, c2267501Dp6.LIZJ.LIZJ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LIZLLL, c2267501Dp6.LIZJ.LIZIZ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LJFF, c2267501Dp6.LIZJ.LIZLLL, 0.0f, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$95(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        C2267471Dp3.LIZ(c2267501Dp6.LJ, c2267501Dp6.LIZJ.LIZJ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LIZLLL, c2267501Dp6.LIZJ.LIZIZ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LJFF, c2267501Dp6.LIZJ.LIZLLL, 0.0f, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$96(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        C2267491Dp5.LIZ(c2267501Dp6.LIZLLL, c2267501Dp6.LIZJ.LIZIZ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LJFF, c2267501Dp6.LIZJ.LIZLLL, 0.0f, 6);
        C2267471Dp3.LIZ(c2267501Dp6.LJI, c2267501Dp6.LIZJ.LJ, 0.0f, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$97(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C2267501Dp6 c2267501Dp6 = (C2267501Dp6) obj;
        C2267471Dp3.LIZ(c2267501Dp6.LJI, c2267501Dp6.LIZJ.LJ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LIZLLL, c2267501Dp6.LIZJ.LIZIZ, 0.0f, 6);
        C2267491Dp5.LIZ(c2267501Dp6.LJFF, c2267501Dp6.LIZJ.LIZLLL, 0.0f, 6);
        return Unit.LIZ;
    }

    public static final Object invoke$98(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        C1647230sy1 c1647230sy1 = (C1647230sy1) obj;
        c1647230sy1.LIZJ = true;
        c1647230sy1.LIZLLL = true;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$100(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$113(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static final Object invoke$171(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$32(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$35(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$36(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$37(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$38(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$80(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$81(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$99(AFwS283S0000000_35 aFwS283S0000000_35, Object obj) {
        return obj;
    }
}
