package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0M2U;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C19471811Ga;
import X.C19EG;
import X.C1A7R;
import X.C2173161A3e;
import X.C2173201A3i;
import X.C339190DRl;
import X.C343970De7;
import X.C424820GlE;
import X.C675940QfI;
import X.C855500XhE;
import X.EnumC1377930lxf;
import X.InterfaceC21661219py;
import X.InterfaceC21661319pz;
import X.InterfaceC21661619q2;
import X.InterfaceC856360Xic;
import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.album.AlbumPreviewFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.share.silent.ShareSelectorPanelFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public class AkS99S0100000_33 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS99S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS99S0100000_33 akS99S0100000_33, View view) {
        ((C1A7R) akS99S0100000_33.l0).LLLLIL().LIZIZ();
    }

    public static final void LIZ$1(AkS99S0100000_33 akS99S0100000_33, View view) {
        ((C1A7R) akS99S0100000_33.l0).LLLLIL().LIZ();
    }

    public static final void LIZ$2(AkS99S0100000_33 akS99S0100000_33, View view) {
        AlbumPreviewFragment albumPreviewFragment = (AlbumPreviewFragment) akS99S0100000_33.l0;
        if (!albumPreviewFragment.LLJJIJIIJIL) {
            C675940QfI.LIZJ("album_photo_click", albumPreviewFragment.LLJILJILJ, new AwS612S0100000_33(albumPreviewFragment, 227));
            ((AlbumPreviewFragment) akS99S0100000_33.l0).LLJJIJIIJIL = true;
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((AlbumPreviewFragment) akS99S0100000_33.l0, C343970De7.LIZ);
    }

    public static final void LIZ$3(AkS99S0100000_33 akS99S0100000_33, View view) {
        boolean z;
        AlbumPreviewFragment albumPreviewFragment = (AlbumPreviewFragment) akS99S0100000_33.l0;
        C424820GlE c424820GlE = albumPreviewFragment.LLJ;
        if (c424820GlE != null && !c424820GlE.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        albumPreviewFragment.MR(z);
    }

    public static final void LIZ$4(AkS99S0100000_33 akS99S0100000_33, View view) {
        LinearLayout linearLayout = ((AlbumPreviewFragment) akS99S0100000_33.l0).LLILZLL;
        if (linearLayout != null) {
            C339190DRl.LIZIZ(linearLayout);
        }
        C19471811Ga.LIZ.getClass();
        C19471811Ga.LIZIZ = true;
    }

    public static final void LIZ$5(AkS99S0100000_33 akS99S0100000_33, View view) {
        Activity activityLIZ;
        EnumC1377930lxf next;
        final C2173201A3i c2173201A3i = (C2173201A3i) akS99S0100000_33.l0;
        Context context = c2173201A3i.getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (activityLIZ instanceof C19EG)) {
            boolean zEnableToastCenter = false;
            if (SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
                if (iAVPublishPageUIRefactorService != null) {
                    zEnableToastCenter = iAVPublishPageUIRefactorService.enableToastCenter();
                }
                if (zEnableToastCenter) {
                    C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                    c1389880mGw.LJIIIZ(context.getString(2131845242));
                    c1389880mGw.LJIIJ();
                    return;
                } else {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIJ(context.getString(2131845242));
                    c1389890mGx.LJIIJJI();
                    return;
                }
            }
            List<EnumC1377930lxf> channels = c2173201A3i.getChannels();
            if (channels.isEmpty()) {
                return;
            }
            ShareSelectorPanelFragment shareSelectorPanelFragment = new ShareSelectorPanelFragment(channels);
            c2173201A3i.LLJJJJJIL = shareSelectorPanelFragment;
            Iterator<EnumC1377930lxf> it2 = channels.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    int saveType = next.getSaveType();
                    Integer num = c2173201A3i.LLJJJIL;
                    if (num != null && saveType == num.intValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            shareSelectorPanelFragment.NR(next);
            shareSelectorPanelFragment.LLJILJIL = new InterfaceC21661619q2() { // from class: X.19q3
                @Override // X.InterfaceC21661619q2
                public final List<InterfaceC21459018yS> KI(int i) {
                    HashMap<Integer, List<InterfaceC21459018yS>> interceptors = c2173201A3i.getInterceptors();
                    Integer numValueOf = Integer.valueOf(i);
                    List<InterfaceC21459018yS> arrayList = interceptors.get(numValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        interceptors.put(numValueOf, arrayList);
                    }
                    return arrayList;
                }
            };
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = shareSelectorPanelFragment;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, activityLIZ);
            final TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJI = numLIZJ;
            tuxSheet.LLJJIJIIJIL = true;
            shareSelectorPanelFragment.LLJ = new InterfaceC21661319pz() { // from class: X.1A3k
                @Override // X.InterfaceC21661319pz
                public final void dx(EnumC1377930lxf enumC1377930lxf, C21458918yR c21458918yR) {
                    IAVPublishService iAVPublishServicePublishService;
                    IAVPublishService iAVPublishServicePublishService2;
                    C2173201A3i c2173201A3i2 = c2173201A3i;
                    boolean zIsChecked = c21458918yR.isChecked();
                    c2173201A3i2.getClass();
                    if (!Intrinsics.LJFF(enumC1377930lxf.getKey(), EnumC1377930lxf.SPARK.getKey())) {
                        EnumC1377930lxf enumC1377930lxf2 = null;
                        if (!zIsChecked) {
                            c2173201A3i2.LLJJJIL = null;
                            TuxTextView tuxTextView = c2173201A3i2.LLJJIJIL;
                            if (tuxTextView != null) {
                                tuxTextView.setText((CharSequence) null);
                            }
                            TuxTextView tuxTextView2 = c2173201A3i2.LLJJIJIL;
                            if (tuxTextView2 != null) {
                                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                            }
                            if (!SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                                C1238740iLA.LIZ().LJ("key_silent_share_save", 0);
                            }
                            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                            if (iExternalService != null && (iAVPublishServicePublishService2 = iExternalService.publishService()) != null) {
                                iAVPublishServicePublishService2.cancelSynthesis(c2173201A3i2.getContext(), "base_sync_share_view_v2");
                            }
                            c2173201A3i2.LJIILJJIL(enumC1377930lxf.getKey(), false);
                            c2173201A3i2.LJIL();
                            return;
                        }
                        Integer num2 = c2173201A3i2.LLJJJIL;
                        if (num2 != null) {
                            if (num2.intValue() != enumC1377930lxf.getSaveType()) {
                                Iterator<EnumC1377930lxf> it3 = c2173201A3i2.getChannels().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    EnumC1377930lxf next2 = it3.next();
                                    int saveType2 = next2.getSaveType();
                                    Integer num3 = c2173201A3i2.LLJJJIL;
                                    if (num3 != null && saveType2 == num3.intValue()) {
                                        enumC1377930lxf2 = next2;
                                        break;
                                    }
                                }
                                EnumC1377930lxf enumC1377930lxf3 = enumC1377930lxf2;
                                if (enumC1377930lxf3 != null) {
                                    c2173201A3i2.LJIILJJIL(enumC1377930lxf3.getKey(), false);
                                }
                            }
                        }
                        c2173201A3i2.LLJJJIL = Integer.valueOf(enumC1377930lxf.getSaveType());
                        TuxTextView tuxTextView3 = c2173201A3i2.LLJJIJIL;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setText(enumC1377930lxf.getLabel());
                        }
                        TuxTextView tuxTextView4 = c2173201A3i2.LLJJIJIL;
                        if (tuxTextView4 != null) {
                            C786410Ut5.LLLLZLL(tuxTextView4, 0);
                        }
                        c2173201A3i2.LJIL();
                        if (!c2173201A3i2.getHasCancelSynthetise()) {
                            c2173201A3i2.setHasCancelSynthetise(true);
                            IExternalService iExternalService2 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                            if (iExternalService2 != null && (iAVPublishServicePublishService = iExternalService2.publishService()) != null) {
                                iAVPublishServicePublishService.cancelSynthesis(c2173201A3i2.getContext(), "base_sync_share_view_v2");
                            }
                        }
                        C1238740iLA.LIZ().LJ("key_silent_share_save", enumC1377930lxf.getSaveType());
                        c2173201A3i2.LJIILJJIL(enumC1377930lxf.getKey(), true);
                    }
                }
            };
            shareSelectorPanelFragment.LLJI = new InterfaceC21661219py() { // from class: X.1A3c
                @Override // X.InterfaceC21661219py
                public final void bL(EnumC1377930lxf enumC1377930lxf, C21458918yR c21458918yR) {
                    long sharePanelDismissDuration = c2173201A3i.getSharePanelDismissDuration();
                    if (sharePanelDismissDuration > 0) {
                        c2173201A3i.LLJJJJ.removeMessages(1);
                        BPEAHandler bPEAHandler = c2173201A3i.LLJJJJ;
                        Message message = new Message();
                        TuxSheet tuxSheet2 = tuxSheet;
                        message.what = 1;
                        message.obj = tuxSheet2;
                        C786410Ut5.LJLJLJ(bPEAHandler, message, sharePanelDismissDuration);
                        return;
                    }
                    tuxSheet.dismiss();
                }
            };
            tuxSheet.show(((C19EG) C1388190mED.LIZ(context)).getSupportFragmentManager(), "share_selector_sheet");
            InterfaceC856360Xic onSharePanelClickListener = c2173201A3i.getOnSharePanelClickListener();
            if (onSharePanelClickListener == null) {
                return;
            }
            C0M2U c0m2u = C0M2U.LIZ;
            VideoPublishEditModel videoPublishEditModel = ((C855500XhE) onSharePanelClickListener).LIZ.LLLLIILL;
            c0m2u.getClass();
            C0M2U.LIZ(videoPublishEditModel, "share", null);
        }
    }

    public static final void LIZ$6(AkS99S0100000_33 akS99S0100000_33, View view) {
        Activity activityLIZ;
        EnumC1377930lxf next;
        final C2173161A3e c2173161A3e = (C2173161A3e) akS99S0100000_33.l0;
        Context context = c2173161A3e.getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (activityLIZ instanceof C19EG)) {
            List<EnumC1377930lxf> channels = c2173161A3e.getChannels();
            if (!channels.isEmpty()) {
                ShareSelectorPanelFragment shareSelectorPanelFragment = new ShareSelectorPanelFragment(channels);
                c2173161A3e.LLJJJJ = shareSelectorPanelFragment;
                Iterator<EnumC1377930lxf> it2 = channels.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        int saveType = next.getSaveType();
                        Integer num = c2173161A3e.LLJJIJIL;
                        if (num != null && saveType == num.intValue()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                shareSelectorPanelFragment.NR(next);
                shareSelectorPanelFragment.LLJILJIL = new InterfaceC21661619q2() { // from class: X.19q4
                    @Override // X.InterfaceC21661619q2
                    public final List<InterfaceC21459018yS> KI(int i) {
                        HashMap<Integer, List<InterfaceC21459018yS>> map = c2173161A3e.LLJJJ;
                        if (map != null) {
                            Integer numValueOf = Integer.valueOf(i);
                            List<InterfaceC21459018yS> arrayList = map.get(numValueOf);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                                map.put(numValueOf, arrayList);
                            }
                            return arrayList;
                        }
                        return new ArrayList();
                    }
                };
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIJI = shareSelectorPanelFragment;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, activityLIZ);
                final TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJI = numLIZJ;
                tuxSheet.LLJJIJIIJIL = true;
                shareSelectorPanelFragment.LLJ = new InterfaceC21661319pz() { // from class: X.1A3f
                    @Override // X.InterfaceC21661319pz
                    public final void dx(EnumC1377930lxf enumC1377930lxf, C21458918yR c21458918yR) {
                        C2173161A3e c2173161A3e2 = c2173161A3e;
                        boolean zIsChecked = c21458918yR.isChecked();
                        if (zIsChecked) {
                            c2173161A3e2.getClass();
                            c2173161A3e2.LLJJIJIL = Integer.valueOf(enumC1377930lxf.getSaveType());
                            TuxTextView tuxTextView = c2173161A3e2.LLJJIJI;
                            if (tuxTextView != null) {
                                tuxTextView.setText(enumC1377930lxf.getLabel());
                            }
                            TuxTextView tuxTextView2 = c2173161A3e2.LLJJIJI;
                            if (tuxTextView2 != null) {
                                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                            }
                        } else {
                            c2173161A3e2.LLJJIJIL = null;
                            TuxTextView tuxTextView3 = c2173161A3e2.LLJJIJI;
                            if (tuxTextView3 != null) {
                                C786410Ut5.LLLLZLL(tuxTextView3, 8);
                            }
                        }
                        c2173161A3e2.LJJIFFI();
                        String key = enumC1377930lxf.getKey();
                        if (Intrinsics.LJFF(key, EnumC1377930lxf.SAVE_LOCAL.getKey())) {
                            if (zIsChecked) {
                                C746350TPl.LIZ.LIZIZ().LJ(1);
                                c2173161A3e2.LJIIJJI("sync_share_save_local");
                                SharePrefCache.inst().getAutoSaveVideo().LJ(Boolean.TRUE);
                            }
                            ((Keva) C604730Nnj.LIZ.getValue()).storeBoolean((String) C604730Nnj.LIZJ.getValue(), true);
                            c2173161A3e2.LJIJJ("download", zIsChecked);
                        } else if (Intrinsics.LJFF(key, EnumC1377930lxf.LINE.getKey())) {
                            if (zIsChecked) {
                                C746350TPl.LIZ.LIZIZ().LJ(11);
                                c2173161A3e2.LJIIJJI("sync_share_save_line");
                                SharePrefCache.inst().getAutoSaveVideo().LJ(Boolean.TRUE);
                            }
                            if (SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                                C2173181A3g.LJIL(c2173161A3e2.LLJJIJI);
                                c21458918yR.setChecked(false);
                                TuxTextView tuxTextView4 = c2173161A3e2.LLJJIJI;
                                if (tuxTextView4 == null) {
                                    return;
                                }
                                C786410Ut5.LLLLZLL(tuxTextView4, 8);
                                return;
                            }
                            c2173161A3e2.LJIJJ("line", zIsChecked);
                        } else if (Intrinsics.LJFF(key, EnumC1377930lxf.MESSENGER.getKey())) {
                            if (zIsChecked) {
                                C746350TPl.LIZ.LIZIZ().LJ(7);
                                c2173161A3e2.LJIIJJI("sync_share_save_messenger");
                                SharePrefCache.inst().getAutoSaveVideo().LJ(Boolean.TRUE);
                            }
                            if (SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                                C2173181A3g.LJIL(c2173161A3e2.LLJJIJI);
                                c21458918yR.setChecked(false);
                                TuxTextView tuxTextView5 = c2173161A3e2.LLJJIJI;
                                if (tuxTextView5 == null) {
                                    return;
                                }
                                C786410Ut5.LLLLZLL(tuxTextView5, 8);
                                return;
                            }
                            c2173161A3e2.LJIJJ("messenger", zIsChecked);
                            return;
                        }
                        if (!zIsChecked && !SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                            C746350TPl.LIZ.LIZIZ().LJ(0);
                            SharePrefCache.inst().getAutoSaveVideo().LJ(Boolean.FALSE);
                        }
                    }
                };
                shareSelectorPanelFragment.LLJI = new InterfaceC21661219py() { // from class: X.1A3d
                    @Override // X.InterfaceC21661219py
                    public final void bL(EnumC1377930lxf enumC1377930lxf, C21458918yR c21458918yR) {
                        long sharePanelDismissDuration = c2173161A3e.getSharePanelDismissDuration();
                        if (sharePanelDismissDuration > 0) {
                            c2173161A3e.LLJJJIL.removeMessages(1);
                            BPEAHandler bPEAHandler = c2173161A3e.LLJJJIL;
                            Message message = new Message();
                            TuxSheet tuxSheet2 = tuxSheet;
                            message.what = 1;
                            message.obj = tuxSheet2;
                            C786410Ut5.LJLJLJ(bPEAHandler, message, sharePanelDismissDuration);
                            return;
                        }
                        tuxSheet.dismiss();
                    }
                };
                tuxSheet.show(((C19EG) C1388190mED.LIZ(context)).getSupportFragmentManager(), "share_selector_sheet");
                InterfaceC856360Xic interfaceC856360Xic = c2173161A3e.LLJJI;
                if (interfaceC856360Xic != null) {
                    C0M2U c0m2u = C0M2U.LIZ;
                    VideoPublishEditModel videoPublishEditModel = ((C855500XhE) interfaceC856360Xic).LIZ.LLLLIILL;
                    c0m2u.getClass();
                    C0M2U.LIZ(videoPublishEditModel, "share", null);
                }
            }
        }
    }
}
