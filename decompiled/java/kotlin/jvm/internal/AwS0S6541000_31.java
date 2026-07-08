package kotlin.jvm.internal;

import X.C09AY;
import X.C19EH;
import X.C20496615Ie;
import X.C786410Ut5;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public class AwS0S6541000_31 extends C09AY implements Function0 {
    public final int $t;
    public int i15;
    public Object l10;
    public Object l6;
    public Object l7;
    public Object l8;
    public Object l9;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public String s4;
    public String s5;
    public boolean z11;
    public boolean z12;
    public boolean z13;
    public boolean z14;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S6541000_31 awS0S6541000_31) {
        C19EH c19ehLJIIJ = ((FragmentManager) awS0S6541000_31.l6).LJIIJ();
        c19ehLJIIJ.LIZJ(R.id.iix, C20496615Ie.LLLLILI((C20496615Ie) awS0S6541000_31.l7, awS0S6541000_31.s0, (MusicModel) awS0S6541000_31.l8, awS0S6541000_31.z11, awS0S6541000_31.z12, (Bundle) awS0S6541000_31.l9, awS0S6541000_31.s1, awS0S6541000_31.s2, awS0S6541000_31.z13, awS0S6541000_31.s3, (UrlModel) awS0S6541000_31.l10, awS0S6541000_31.i15, awS0S6541000_31.z14, awS0S6541000_31.s4, awS0S6541000_31.s5, true), "choose_music_fragment_tag");
        c19ehLJIIJ.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S6541000_31 awS0S6541000_31) {
        if (((C20496615Ie) awS0S6541000_31.l6).LLLLIL().LLILLJJLI) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setCurMusic(null, 0);
        }
        C20496615Ie c20496615Ie = (C20496615Ie) awS0S6541000_31.l6;
        TextView textView = (TextView) c20496615Ie.requireViewById(R.id.tv_right_title);
        TextView textView2 = (TextView) c20496615Ie.requireViewById(R.id.epw);
        C786410Ut5.LLIL(textView, 8);
        C786410Ut5.LLIL(textView2, 8);
        BaseChooseMusicFragment baseChooseMusicFragment = (BaseChooseMusicFragment) ((FragmentManager) awS0S6541000_31.l7).LJJJJZ(R.id.iix);
        if (baseChooseMusicFragment != null) {
            if (baseChooseMusicFragment.LLILZLL) {
                baseChooseMusicFragment.LLILZLL = false;
                FrameLayout frameLayout = baseChooseMusicFragment.LLJ.LJ;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                try {
                    baseChooseMusicFragment.getChildFragmentManager().LJLLL();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (baseChooseMusicFragment.OR() != null) {
                    baseChooseMusicFragment.OR().getClass();
                }
            }
            C19EH c19ehLJIIJ = ((FragmentManager) awS0S6541000_31.l7).LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iix, C20496615Ie.LLLLILI((C20496615Ie) awS0S6541000_31.l6, awS0S6541000_31.s0, (MusicModel) awS0S6541000_31.l8, awS0S6541000_31.z11, awS0S6541000_31.z12, (Bundle) awS0S6541000_31.l9, awS0S6541000_31.s1, awS0S6541000_31.s2, awS0S6541000_31.z13, awS0S6541000_31.s3, (UrlModel) awS0S6541000_31.l10, awS0S6541000_31.i15, awS0S6541000_31.z14, awS0S6541000_31.s4, awS0S6541000_31.s5, false), "choose_music_fragment_tag");
            c19ehLJIIJ.LJIIIZ();
        } else {
            C19EH c19ehLJIIJ2 = ((FragmentManager) awS0S6541000_31.l7).LJIIJ();
            c19ehLJIIJ2.LIZJ(R.id.iix, C20496615Ie.LLLLILI((C20496615Ie) awS0S6541000_31.l6, awS0S6541000_31.s0, (MusicModel) awS0S6541000_31.l8, awS0S6541000_31.z11, awS0S6541000_31.z12, (Bundle) awS0S6541000_31.l9, awS0S6541000_31.s1, awS0S6541000_31.s2, awS0S6541000_31.z13, awS0S6541000_31.s3, (UrlModel) awS0S6541000_31.l10, awS0S6541000_31.i15, awS0S6541000_31.z14, awS0S6541000_31.s4, awS0S6541000_31.s5, true), "choose_music_fragment_tag");
            c19ehLJIIJ2.LJIIIZ();
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S6541000_31(int r19, android.os.Bundle r20, androidx.fragment.app.FragmentManager r21, com.ss.android.ugc.aweme.base.model.UrlModel r22, X.C20496615Ie r23, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, boolean r31, boolean r32, boolean r33, boolean r34, int r35) {
        /*
            r18 = this;
            r1 = r35
            r17 = r18
            r0 = r17
            r0.$t = r1
            r2 = r34
            r0 = r33
            r3 = r32
            r4 = r31
            r5 = r30
            r6 = r29
            r7 = r28
            r8 = r27
            r9 = r26
            r10 = r25
            r11 = r24
            r12 = r23
            r13 = r22
            r14 = r21
            r15 = r20
            r16 = r19
            if (r1 == 0) goto L53
            r1 = r17
            r1.l6 = r12
            r1.l7 = r14
            r1.s0 = r10
            r1.l8 = r11
            r1.z11 = r4
            r1.z12 = r3
            r1.l9 = r15
            r1.s1 = r9
            r1.s2 = r8
            r1.z13 = r0
            r1.s3 = r7
            r1.l10 = r13
            r0 = r16
            r1.i15 = r0
            r1.z14 = r2
            r1.s4 = r6
            r1.s5 = r5
            r0 = 0
        L4f:
            r1.<init>(r0)
            return
        L53:
            r1 = r17
            r1.l6 = r14
            r1.l7 = r12
            r1.s0 = r10
            r1.l8 = r11
            r1.z11 = r4
            r1.z12 = r3
            r1.l9 = r15
            r1.s1 = r9
            r1.s2 = r8
            r1.z13 = r0
            r1.s3 = r7
            r1.l10 = r13
            r0 = r16
            r1.i15 = r0
            r1.z14 = r2
            r1.s4 = r6
            r1.s5 = r5
            r0 = 0
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S6541000_31.<init>(int, android.os.Bundle, androidx.fragment.app.FragmentManager, com.ss.android.ugc.aweme.base.model.UrlModel, X.15Ie, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int):void");
    }
}
