package kotlin.jvm.internal;

import X.C09AY;
import X.C0U6J;
import X.C0U6K;
import X.C0UH7;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1347740lAy;
import X.C1397620mTQ;
import X.C20743716Ff;
import X.C249600xq;
import X.C259800zU;
import X.C499640Jic;
import X.C761590Tu9;
import X.EnumC776090UcR;
import X.InterfaceC781800Ule;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.privacy.setting.tpsc.account.ui.privateaccount.QuitBaAccountProcessor;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS98S0201000_12 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS98S0201000_12 awS98S0201000_12, Object obj) {
        String eventKey;
        C20743716Ff c20743716Ff;
        C499640Jic c499640JicLJJIIZ;
        C0UH7 c0uh7 = EnumC776090UcR.Companion;
        int i = awS98S0201000_12.i2;
        c0uh7.getClass();
        EnumC776090UcR enumC776090UcRLIZ = C0UH7.LIZ(i);
        if (enumC776090UcRLIZ == null || (eventKey = enumC776090UcRLIZ.getEventKey()) == null) {
            eventKey = "";
        }
        LiveHostSettingFragmentSheet liveHostSettingFragmentSheet = (LiveHostSettingFragmentSheet) awS98S0201000_12.l0;
        String str = liveHostSettingFragmentSheet.LLLIZZ;
        DataChannel dataChannel = liveHostSettingFragmentSheet.LLJZ;
        InterfaceC781800Ule interfaceC781800Ule = (InterfaceC781800Ule) ((C259800zU) awS98S0201000_12.l1).element;
        if (interfaceC781800Ule != null && (c499640JicLJJIIZ = interfaceC781800Ule.LJJIIZ()) != null) {
            c20743716Ff = c499640JicLJJIIZ.LJI;
        } else {
            c20743716Ff = null;
        }
        C249600xq.LIZ("click", eventKey, str, dataChannel, c20743716Ff);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS98S0201000_12 awS98S0201000_12, Object obj) {
        String eventKey;
        C20743716Ff c20743716Ff;
        C499640Jic c499640JicLJJIIZ;
        C0UH7 c0uh7 = EnumC776090UcR.Companion;
        int i = awS98S0201000_12.i2;
        c0uh7.getClass();
        EnumC776090UcR enumC776090UcRLIZ = C0UH7.LIZ(i);
        if (enumC776090UcRLIZ == null || (eventKey = enumC776090UcRLIZ.getEventKey()) == null) {
            eventKey = "";
        }
        LiveHostSettingFragmentSheet liveHostSettingFragmentSheet = (LiveHostSettingFragmentSheet) awS98S0201000_12.l0;
        String str = liveHostSettingFragmentSheet.LLLIZZ;
        DataChannel dataChannel = liveHostSettingFragmentSheet.LLJZ;
        InterfaceC781800Ule interfaceC781800Ule = (InterfaceC781800Ule) ((C259800zU) awS98S0201000_12.l1).element;
        if (interfaceC781800Ule != null && (c499640JicLJJIIZ = interfaceC781800Ule.LJJIIZ()) != null) {
            c20743716Ff = c499640JicLJJIIZ.LJI;
        } else {
            c20743716Ff = null;
        }
        C249600xq.LIZ("click_more", eventKey, str, dataChannel, c20743716Ff);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS98S0201000_12 awS98S0201000_12, Object obj) {
        int iIntValue;
        Sticker sticker = (Sticker) obj;
        C0U6J c0u6j = (C0U6J) awS98S0201000_12.l0;
        if (c0u6j.LL) {
            if (Intrinsics.LJFF(c0u6j.LLIZ, sticker.LIZ)) {
                C0U6J c0u6j2 = (C0U6J) awS98S0201000_12.l0;
                c0u6j2.LLIZ = null;
                c0u6j2.LLIZLLLIL = null;
                c0u6j2.LLILLJJLI.invoke(sticker, -1);
                ((C0U6K) ((RecyclerView.ViewHolder) awS98S0201000_12.l1)).I5(false);
            } else {
                ((C0U6J) awS98S0201000_12.l0).LLIZ = sticker.LIZ;
                ((C0U6K) ((RecyclerView.ViewHolder) awS98S0201000_12.l1)).I5(true);
                C0U6J c0u6j3 = (C0U6J) awS98S0201000_12.l0;
                Integer num = c0u6j3.LLIZLLLIL;
                if (num != null && (iIntValue = num.intValue()) >= 0) {
                    c0u6j3.notifyItemChanged(iIntValue, c0u6j3.LLJ);
                }
                ((C0U6J) awS98S0201000_12.l0).LLIZLLLIL = Integer.valueOf(awS98S0201000_12.i2);
                ((C0U6J) awS98S0201000_12.l0).LLILLJJLI.invoke(sticker, Integer.valueOf(awS98S0201000_12.i2));
            }
        } else {
            c0u6j.LLILLJJLI.invoke(sticker, Integer.valueOf(awS98S0201000_12.i2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS98S0201000_12 awS98S0201000_12, Object obj) throws Throwable {
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) awS98S0201000_12.l0;
        int iIntValue = awS98S0201000_12.i2;
        Intent intent = (Intent) awS98S0201000_12.l1;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcIGkM9tlnBcBz8J0Uat9SeALkRWht9g4RDbbHRGmiXIQaOLQVIgOEqsrBHret23EJmV3mQ==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {Integer.valueOf(iIntValue), intent};
        C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102101, "android/media/projection/MediaProjectionManager", "getMediaProjection", mediaProjectionManager, objArr, "android.media.projection.MediaProjection", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102101, "android/media/projection/MediaProjectionManager", "getMediaProjection", null, objArr, mediaProjectionManager, c0wzw, false);
            return c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj2 = objArr2[0];
            if (obj2 != null) {
                mediaProjectionManager = (MediaProjectionManager) obj2;
            }
            Object obj3 = objArr2[1];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
            Object obj4 = c0wsuLIZIZ.LIZJ[2];
            if (obj4 != null) {
                intent = (Intent) obj4;
            }
        }
        MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(iIntValue, intent);
        c0wst.LIZ(102101, "android/media/projection/MediaProjectionManager", "getMediaProjection", mediaProjection, objArr, mediaProjectionManager, c0wzw, true);
        return mediaProjection;
    }

    public static final Object invoke$4(AwS98S0201000_12 awS98S0201000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(awS98S0201000_12.i2, new AwS378S0200000_12((QuitBaAccountProcessor) awS98S0201000_12.l0, (User) awS98S0201000_12.l1, 98));
        c1397620mTQ.LJII(2131845249, AFwS245S0000000_12.get$arr$(230));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS98S0201000_12 awS98S0201000_12, Object obj) {
        ((C761590Tu9) awS98S0201000_12.l0).LLLLLZ((View) obj, (SoundEffect) awS98S0201000_12.l1, awS98S0201000_12.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS98S0201000_12 awS98S0201000_12, Object obj) {
        C1347740lAy.LIZIZ(awS98S0201000_12.i2, (Fragment) awS98S0201000_12.l0);
        Function0 function0 = (Function0) awS98S0201000_12.l1;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S0201000_12(int i, int i2, LiveHostSettingFragmentSheet liveHostSettingFragmentSheet, C259800zU<InterfaceC781800Ule> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = liveHostSettingFragmentSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0201000_12(int i, QuitBaAccountProcessor quitBaAccountProcessor, User user, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = quitBaAccountProcessor;
        this.l1 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0201000_12(C761590Tu9 c761590Tu9, SoundEffect soundEffect, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c761590Tu9;
        this.l1 = soundEffect;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0201000_12(C0U6J c0u6j, RecyclerView.ViewHolder viewHolder, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0u6j;
        this.l1 = viewHolder;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS98S0201000_12(MediaProjectionManager mediaProjectionManager, int i, Intent intent, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = mediaProjectionManager;
        this.i2 = i;
        this.l1 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS98S0201000_12(Fragment fragment, Fragment fragment2, int i, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = fragment;
        this.i2 = fragment2;
        this.l1 = i;
    }
}
