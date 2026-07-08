package kotlin.jvm.internal;

import X.C09AY;
import X.C0C64;
import X.C0E10;
import X.C0E1T;
import X.C0E48;
import X.C0E55;
import X.C0EFE;
import X.C0EM1;
import X.C0EM3;
import X.C0ETT;
import X.C0L7R;
import X.C0LAB;
import X.C118300cf;
import X.C1397620mTQ;
import X.C1454900nxo;
import X.C1465110oEH;
import X.C1524705y1;
import X.C20684815ws;
import X.C2097608Jq;
import X.C349930Dnj;
import X.C350870DpF;
import X.C350890DpH;
import X.C351110Dpd;
import X.C351220Dpo;
import X.C357700E0q;
import X.C361680EFy;
import X.C362710EJx;
import X.C363230ELx;
import X.C363500EMy;
import X.C371860Ei0;
import X.C376630Eph;
import X.C384100F4e;
import X.C524780Ki4;
import Y.ARunnableS8S0210000_5;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class AwS59S0210000_5 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        String musicId;
        String str;
        NLETrack nLETrackLIZLLL;
        VecNLETrackSlotSPtr sortedSlots;
        C1454900nxo c1454900nxo = (C1454900nxo) obj;
        AVMusic aVMusic = c1454900nxo.LIZJ;
        String musicId2 = null;
        if (aVMusic != null) {
            musicId = aVMusic.getMusicId();
        } else {
            musicId = null;
        }
        PerformanceMonitor performanceMonitorLIZ = C0EM1.LIZ(musicId);
        if (performanceMonitorLIZ != null) {
            j jVar = C524780Ki4.LIZ;
            jVar.getClass();
            jVar.LIZLLL(performanceMonitorLIZ.getType(), "back to edit pro page", performanceMonitorLIZ, 5);
        }
        C363230ELx c363230ELx = (C363230ELx) awS59S0210000_5.l0;
        boolean z = awS59S0210000_5.z2;
        Integer num = (Integer) awS59S0210000_5.l1;
        c363230ELx.getClass();
        if (c1454900nxo.LIZ) {
            if (z && num != null) {
                C0E48 c0e48 = c363230ELx.LIZJ;
                if (c0e48 != null && (nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48)) != null && (sortedSlots = nLETrackLIZLLL.getSortedSlots()) != null && num.intValue() >= 0 && num.intValue() < sortedSlots.size()) {
                    C0EM3 c0em3 = c363230ELx.LJJ;
                    if (c0em3 != null) {
                        c0em3.LIZJ();
                    }
                    c363230ELx.Y0(sortedSlots.get(num.intValue()), false, true);
                } else {
                    c363230ELx.Y0(null, false, true);
                    C0EM3 c0em32 = c363230ELx.LJJ;
                    if (c0em32 != null) {
                        c0em32.LIZJ();
                    }
                }
            } else {
                c363230ELx.Y0(null, false, true);
                C0EM3 c0em33 = c363230ELx.LJJ;
                if (c0em33 != null) {
                    c0em33.LIZJ();
                }
            }
        } else if (c1454900nxo.LIZJ != null && !TextUtils.isEmpty(c1454900nxo.LIZLLL)) {
            C0EM3 c0em34 = c363230ELx.LJJ;
            if (c0em34 != null) {
                c0em34.LIZJ();
            }
            AVMusic aVMusic2 = c1454900nxo.LIZJ;
            if (aVMusic2 != null && (str = c1454900nxo.LIZLLL) != null) {
                if (!C349930Dnj.LIZ(c363230ELx.LJI(), c363230ELx.LJII(), false)) {
                    num = null;
                }
                String str2 = c1454900nxo.LIZIZ;
                if (str2 == null) {
                    str2 = "";
                }
                c363230ELx.d1(aVMusic2, str, str2, false, c363230ELx.LJIL, num, null, AFwS234S0000000_5.get$arr$(9));
            }
        }
        VideoPublishEditModel videoPublishEditModelLJI = c363230ELx.LJI();
        if (videoPublishEditModelLJI != null) {
            AVMusic aVMusic3 = c1454900nxo.LIZJ;
            if (aVMusic3 != null) {
                musicId2 = aVMusic3.getMusicId();
            }
            C361680EFy.LJJIIJ(videoPublishEditModelLJI, c363230ELx.LIZJ, "from_music_page", "sound", musicId2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        Long lLIZ;
        long jLongValue;
        Object next;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
        C363500EMy c363500EMy = C363500EMy.LIZ;
        C0E48 c0e48 = (C0E48) awS59S0210000_5.l0;
        c363500EMy.getClass();
        C363500EMy.LJIILLIIL(c0e48);
        if (awS59S0210000_5.z2) {
            C0E48 c0e482 = (C0E48) awS59S0210000_5.l0;
            if (((C1465110oEH) awS59S0210000_5.l1).LJIIZILJ != null) {
                Iterator it2 = ((ArrayList) C351220Dpo.LJIJJ(C350870DpF.LJI(c0e482))).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        NLETrack nLETrack = (NLETrack) next;
                        if (C351220Dpo.LLILLL(nLETrack) || C351220Dpo.LLJILLL(nLETrack)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrack nLETrack2 = (NLETrack) next;
                if (nLETrack2 != null && (!nLETrack2.getSortedSlots().isEmpty()) && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrack2.getSortedSlots().get(0).getMainSegment())) != null) {
                    nLESegmentAudioDynamicCast.setTimeClipStart(r4.getFirst().intValue());
                    nLESegmentAudioDynamicCast.setTimeClipEnd(r4.getSecond().intValue());
                    C350870DpF.LIZ(c0e482, false);
                }
            }
        }
        if (nLETimeSpaceNode != null && ((C1465110oEH) awS59S0210000_5.l1).LJIIIIZZ() && C349930Dnj.LJI(C350870DpF.LJI((C0E48) awS59S0210000_5.l0))) {
            ((C0E48) awS59S0210000_5.l0).getPlayer().LJIJI(nLETimeSpaceNode.getStartTime(), C351110Dpd.LIZ);
            ((C1465110oEH) awS59S0210000_5.l1).LJIIIZ = C351220Dpo.LLLLLLL(nLETimeSpaceNode.getStartTime());
            if (((C1465110oEH) awS59S0210000_5.l1).LJIIJJI()) {
                ((C0E48) awS59S0210000_5.l0).getPlayer().LJJIIZI(nLETimeSpaceNode.getStartTime(), nLETimeSpaceNode.getEndTime(), false, true);
            } else {
                ((C0E48) awS59S0210000_5.l0).getPlayer().LLIL(true);
            }
        } else {
            C0E55 player = ((C0E48) awS59S0210000_5.l0).getPlayer();
            if (awS59S0210000_5.z2) {
                lLIZ = ((C1465110oEH) awS59S0210000_5.l1).LJIIJ;
                if (lLIZ == null) {
                    jLongValue = 0;
                }
                player.LJIJI(jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
                ((C0E48) awS59S0210000_5.l0).getPlayer().LLIL(false);
            } else {
                lLIZ = ((C1465110oEH) awS59S0210000_5.l1).LIZ();
            }
            jLongValue = lLIZ.longValue();
            player.LJIJI(jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
            ((C0E48) awS59S0210000_5.l0).getPlayer().LLIL(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131833342, new AwS371S0200000_5((C384100F4e) awS59S0210000_5.l0, (VideoPublishEditModel) awS59S0210000_5.l1, 284));
        c1397620mTQ.LJII(2131833339, new AwS93S0110000_5((C384100F4e) awS59S0210000_5.l0, awS59S0210000_5.z2, 20));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        int i;
        float fFloatValue = ((Number) obj).floatValue();
        int i2 = C0L7R.LJJIJIIJIL;
        float f = i2 * fFloatValue;
        if (awS59S0210000_5.z2) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = ((C118300cf) awS59S0210000_5.l0).element;
        float f2 = (f * i) - i3;
        if (fFloatValue == 1.0f) {
            ((C0L7R) awS59S0210000_5.l1).LJJJJZ(i2 - i3);
            ((C118300cf) awS59S0210000_5.l0).element = C0L7R.LJJIJIIJIL;
        } else {
            int i4 = (int) f2;
            if (i4 >= 1) {
                ((C0L7R) awS59S0210000_5.l1).LJJJJZ(i4);
                ((C118300cf) awS59S0210000_5.l0).element += i4;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ep_magic_bugfix_login_apply_error", true, true) && !awS59S0210000_5.z2) {
            C1524705y1.LIZIZ(500L, new ARunnableS8S0210000_5((C357700E0q) awS59S0210000_5.l1, (Function1) awS59S0210000_5.l0, zBooleanValue, 1));
        } else {
            ((Function1) awS59S0210000_5.l0).invoke(Boolean.valueOf(zBooleanValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ep_magic_bugfix_login_apply_error", true, true) && !awS59S0210000_5.z2) {
            C1524705y1.LIZIZ(500L, new ARunnableS8S0210000_5((C357700E0q) awS59S0210000_5.l1, (C0E10) awS59S0210000_5.l0, zBooleanValue, 2));
        } else {
            ((C0E10) awS59S0210000_5.l0).LIZ(zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        int iIntValue;
        String message;
        Object obj2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C362710EJx c362710EJx = C362710EJx.LIZ;
        boolean z = awS59S0210000_5.z2;
        Integer num = (Integer) awS59S0210000_5.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Exception exc = (Exception) awS59S0210000_5.l1;
        if (exc == null || (message = exc.getMessage()) == null) {
            message = "";
        }
        boolean z2 = !zBooleanValue;
        c362710EJx.getClass();
        Pair[] pairArr = new Pair[4];
        String str = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, obj2);
        if (z2) {
            str = "1";
        }
        pairArr[1] = new Pair("use_cache", str);
        pairArr[2] = new Pair("error_code", String.valueOf(iIntValue));
        pairArr[3] = new Pair("error_domain", message);
        C20684815ws.LJIILLIIL("load_filter_panel", C2097608Jq.LJIIJ(pairArr));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        ArrayList<Pair<String, String>> arrayList = ((C0ETT) awS59S0210000_5.l0).LJIIIZ;
        boolean z = true;
        int iIntValue = 0;
        if ((arrayList == null || arrayList.isEmpty()) && !awS59S0210000_5.z2) {
            z = false;
        }
        Integer num = (Integer) awS59S0210000_5.l1;
        if (num != null) {
            iIntValue = num.intValue();
        }
        boolean z2 = ((C0ETT) awS59S0210000_5.l0).LJIILIIL;
        obj.getClass();
        return new C371860Ei0(z, iIntValue, z2);
    }

    public static final Object invoke$7(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        ((C1397620mTQ) obj).LJII(2131848055, new AwS59S0210000_5((C376630Eph) awS59S0210000_5.l0, (C376630Eph) awS59S0210000_5.l1, (Function2<? super Boolean, ? super Boolean, Unit>) awS59S0210000_5.z2, true));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        ((C376630Eph) awS59S0210000_5.l0).Q3().w6(null, false, false);
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
        ((C376630Eph) awS59S0210000_5.l0).z4((Function2) awS59S0210000_5.l1, awS59S0210000_5.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS59S0210000_5 awS59S0210000_5, Object obj) {
        String message;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0EFE c0efe = C0EFE.LIZ;
        boolean z = awS59S0210000_5.z2;
        Integer num = (Integer) awS59S0210000_5.l0;
        Exception exc = (Exception) awS59S0210000_5.l1;
        if (exc == null || (message = exc.getMessage()) == null) {
            message = "";
        }
        int i = !zBooleanValue ? 1 : 0;
        c0efe.getClass();
        int i2 = !z ? 1 : 0;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "use_cache");
        if (!z && num != null) {
            c0lab.LIZ(num.intValue(), "error_code");
            c0lab.LJ("error_domain", message);
        }
        C20684815ws.LJIILLIIL("load_anim_panel", c0lab.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0210000_5(C357700E0q c357700E0q, C0E10 c0e10, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c0e10;
        this.l1 = c357700E0q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0210000_5(C357700E0q c357700E0q, Function1 function1, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = function1;
        this.l1 = c357700E0q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0210000_5(C0E48 c0e48, boolean z, C1465110oEH c1465110oEH, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0e48;
        this.z2 = z;
        this.l1 = c1465110oEH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0210000_5(C363230ELx c363230ELx, boolean z, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l0 = c363230ELx;
        this.z2 = z;
        this.l1 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0210000_5(C0ETT c0ett, boolean z, Integer num, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0ett;
        this.z2 = z;
        this.l1 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS59S0210000_5(C376630Eph c376630Eph, C376630Eph c376630Eph2, Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c376630Eph;
        this.l1 = c376630Eph2;
        this.z2 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0210000_5(C384100F4e c384100F4e, VideoPublishEditModel videoPublishEditModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c384100F4e;
        this.l1 = videoPublishEditModel;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0210000_5(boolean z, C118300cf c118300cf, C0L7R c0l7r, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c118300cf;
        this.l1 = c0l7r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0210000_5(boolean z, Integer num, Exception exc, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = num;
        this.l1 = exc;
    }
}
