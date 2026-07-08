package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C0IJT;
import X.C0JBN;
import X.C0JSS;
import X.C0UA1;
import X.C0UCF;
import X.C0UD4;
import X.C0UHE;
import X.C0UJY;
import X.C0UM0;
import X.C0UPF;
import X.C1161920gLG;
import X.C1276840jKc;
import X.C1308910kAL;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C419910GdJ;
import X.C452501pT;
import X.C465520INi;
import X.C474500IjA;
import X.C500260Jjc;
import X.C760180Trs;
import X.C766720U5u;
import X.C768430UCj;
import X.C768460UCm;
import X.C768910UEf;
import X.C768960UEk;
import X.C768970UEl;
import X.C768980UEm;
import X.C771670UOv;
import X.C781270Ukn;
import X.C786410Ut5;
import X.InterfaceC768930UEh;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.NewInsertStickerEvent;
import com.bytedance.android.live.effect.api.NoNewInsertStickerInPreviewEvent;
import com.bytedance.android.live.effect.api.PreviewRevisionUpdateBottomIconEvent;
import com.bytedance.android.live.effect.api.SelectH5StickerInPreview;
import com.bytedance.android.livesdk.broadcast.PreviewBottomFunctionHideFakeEffectsEvent;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHelper;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewBottomFirstLoadOptABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.SupportBillboardOverlaySetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewStickerHelper implements GenericLifecycleObserver {
    public final DataChannel LL;
    public final Context LLILLJJLI;
    public final ImageView LLILLL;
    public final C0UJY LLILZIL;
    public final View LLILZLL;
    public LiveEffect LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC768930UEh LLJI;
    public final C768970UEl LLJIJIL;
    public String LLJILJIL;
    public final C768960UEk LLJILLL;
    public final C768910UEf LLJJ;
    public final View LLILZ = null;
    public final boolean LLJ = Intrinsics.LJFF("insert_props", C768980UEm.LIZ);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 894));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onPreviewFragmentDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onPreviewFragmentDestroy() {
        C768970UEl c768970UEl = this.LLJIJIL;
        if (c768970UEl != null) {
            c768970UEl.LIZJ(this.LLJILLL);
        }
        C0UPF c0upfLJ = C771670UOv.LJ();
        if (c0upfLJ != null) {
            c0upfLJ.LIZJ = null;
        }
    }

    public final void LIZ() {
        if (C760180Trs.LJFF()) {
            DataChannel dataChannel = this.LL;
            if (dataChannel != null) {
                dataChannel.FQ2(PreviewRevisionUpdateBottomIconEvent.class);
            }
        } else {
            ImageView imageView = this.LLILLL;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.eqh);
            }
        }
        ImageView imageView2 = this.LLILLL;
        if (imageView2 != null) {
            C786410Ut5.Qb(imageView2, 1.0f);
        }
        ImageView imageView3 = this.LLILLL;
        if (imageView3 != null) {
            C786410Ut5.rc(imageView3, 1.0f);
        }
    }

    public final void LIZIZ(LiveEffect liveEffect) {
        LiveEffect.CommerceExtra commerceExtra;
        ImageModel imageModelLIZ;
        ImageModel imageModelLIZ2;
        C0UJY c0ujy = this.LLILZIL;
        String str = C0UD4.LIZIZ;
        c0ujy.LJJ(liveEffect, str);
        C768460UCm.LIZIZ().sr();
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL();
        Boolean boolValueOf = null;
        if (stickerSDKExtraLJLJLLL != null) {
            commerceExtra = stickerSDKExtraLJLJLLL.commerceExtra;
        } else {
            commerceExtra = null;
        }
        if (commerceExtra == null) {
            if (AnchorPreviewBottomFirstLoadOptABSetting.INSTANCE.enable()) {
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                UrlModel icon = liveEffect.getIcon();
                if (icon != null) {
                    imageModelLIZ2 = icon.LIZ();
                } else {
                    imageModelLIZ2 = null;
                }
                C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(imageModelLIZ2);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_color_effect;
                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.exp, this.LLILLJJLI);
                c1324610kZfLJIIIZ.LJIIJJI = c419910GdJ.LIZ(this.LLILLJJLI);
                c1324610kZfLJIIIZ.LJJI(this.LLILLL);
                this.LL.FQ2(PreviewBottomFunctionHideFakeEffectsEvent.class);
            } else {
                C0JBN c0jbnLIZ2 = C1819620xS4.LIZ();
                UrlModel icon2 = liveEffect.getIcon();
                if (icon2 != null) {
                    imageModelLIZ = icon2.LIZ();
                } else {
                    imageModelLIZ = null;
                }
                C1324610kZf c1324610kZfLJIIIZ2 = c0jbnLIZ2.LJIIIZ(imageModelLIZ);
                c1324610kZfLJIIIZ2.LJIIIZ = R.drawable.eqh;
                c1324610kZfLJIIIZ2.LJJI(this.LLILLL);
            }
        } else {
            LIZ();
        }
        View view = this.LLILZ;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
        HashMap map = new HashMap();
        map.put(FollowStatusChangeMethod.PARAM_UID, String.valueOf(liveEffect.getEffectId()));
        String name = liveEffect.getName();
        if (name == null) {
            name = "";
        }
        map.put("name", name);
        C465520INi.LIZ.t10("sticker", map);
        InterfaceC768930UEh interfaceC768930UEh = this.LLJI;
        if (interfaceC768930UEh != null) {
            boolValueOf = Boolean.valueOf(interfaceC768930UEh.LJIIIIZZ(liveEffect));
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            InterfaceC768930UEh interfaceC768930UEh2 = this.LLJI;
            if (interfaceC768930UEh2 != null) {
                interfaceC768930UEh2.LJFF(liveEffect);
            }
        } else {
            InterfaceC768930UEh interfaceC768930UEh3 = this.LLJI;
            if (interfaceC768930UEh3 != null) {
                interfaceC768930UEh3.LIZJ();
            }
            this.LL.LC0(StickerSelectedEvent.class, new C0UCF(liveEffect, str, this.LLJILJIL, false));
        }
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        String strValueOf = String.valueOf(liveEffect.getEffectId());
        c1276840jKc.getClass();
        C1276840jKc.LJIIL(strValueOf);
        C1276840jKc.LJIILL(liveEffect.getResourceId());
        C1276840jKc.LJIILIIL.put("effect_resource_id", String.valueOf(liveEffect.getEffectId()));
        C1276840jKc.LJIIJ(liveEffect, false);
    }

    public final void LIZJ(LiveEffect liveEffect) {
        ImageModel imageModelLIZ;
        float f;
        if (this.LLJ) {
            if (this.LLILZ != null) {
                f = 1.0625f;
            } else {
                f = 1.0f;
            }
            C0UM0.LIZ(this.LLILLL, f, new AwS413S0200000_12(this, liveEffect, 10), 2);
        } else {
            ImageView imageView = this.LLILLL;
            UrlModel icon = liveEffect.getIcon();
            if (icon != null) {
                imageModelLIZ = icon.LIZ();
            } else {
                imageModelLIZ = null;
            }
            C0JSS.LJ(imageView, imageModelLIZ, 0);
            View view = this.LLILZ;
            if (view != null) {
                C500260Jjc.LJIILIIL(view);
            }
        }
        C781270Ukn.LJI().getLiveEffectDataProvider();
        if (!C766720U5u.LJIILLIIL(liveEffect)) {
            C781270Ukn.LJI().getLiveEffectDataProvider();
            C766720U5u.LJ(liveEffect, null);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_effect_icon_show");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLJ ? 1 : 0), "is_animation");
        c474500IjALIZ.LJJII(liveEffect.getResourceId(), "resource_id");
        c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
        c474500IjALIZ.LJJII(liveEffect.getName(), "effect_name");
        c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(liveEffect.getLogParams().LIZLLL)) ? 1 : 0), "is_rec_pin");
        c474500IjALIZ.LIZ();
        this.LLIZLLLIL = true;
    }

    public final void LIZLLL(Map<String, String> map) {
        if (C0UM0.LIZ) {
            return;
        }
        this.LL.FQ2(PreviewHideKeyboardEvent.class);
        C781270Ukn.LJI().showStickerPanel(this.LLILLJJLI, this.LL, false, this.LLJJ, false, false, false, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0UEk, X.0UHE] */
    public PreviewStickerHelper(Fragment fragment, DataChannel dataChannel, Context context, ImageView imageView, C0UJY c0ujy, LifecycleOwner lifecycleOwner, View view) {
        this.LL = dataChannel;
        this.LLILLJJLI = context;
        this.LLILLL = imageView;
        InterfaceC768930UEh interfaceC768930UEh = null;
        this.LLILZIL = c0ujy;
        this.LLILZLL = view;
        ?? r2 = new C0UHE() { // from class: X.0UEk
            @Override // X.C0UHE
            public final void onMessageReceived(int i, int i2, int i3, String str) {
                LiveEffect liveEffect;
                List<LiveEffect> listQr;
                LiveEffect liveEffect2;
                InterfaceC390601fU effectBoardService;
                C768970UEl c768970UEl;
                if (i != 32) {
                    if (i != 67) {
                        if (i != 70) {
                            if (i == 112 && (c768970UEl = this.LL.LLJIJIL) != null) {
                                c768970UEl.sendEffectMsg(112, 2L, 2L, "");
                                return;
                            }
                            return;
                        }
                        if (i2 != 4 || i3 != 1 || (effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "")) == null) {
                            return;
                        }
                        effectBoardService.LIZLLL(str);
                        return;
                    }
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 4) {
                                    if (i2 != 5 || i3 != 0 || (listQr = C768460UCm.LIZIZ().qr(C0UD4.LIZLLL)) == null || (liveEffect2 = (LiveEffect) C13LP.LJJJLL(listQr)) == null) {
                                        return;
                                    }
                                    PreviewStickerHelper previewStickerHelper = this.LL;
                                    if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEcEffectHelper() == null) {
                                        return;
                                    }
                                    C0UBQ.LJIIL(liveEffect2, previewStickerHelper.LLILLJJLI, (Long) previewStickerHelper.LL.gg0(C751340Tdc.class));
                                    return;
                                }
                                if (i3 != 0 || !SupportBillboardOverlaySetting.INSTANCE.enable()) {
                                    return;
                                }
                                ((C769050UEt) this.LL.LLJILJILJ.getValue()).LIZIZ(str);
                                return;
                            }
                            List<LiveEffect> listQr2 = C768460UCm.LIZIZ().qr(C0UD4.LIZIZ);
                            if (listQr2 == null || (liveEffect = (LiveEffect) C13LP.LJJJLL(listQr2)) == null) {
                                return;
                            }
                            PreviewStickerHelper previewStickerHelper2 = this.LL;
                            if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEcEffectHelper() == null) {
                                return;
                            }
                            C0UBQ.LJIIJJI(liveEffect, previewStickerHelper2.LLILLJJLI, str, (Long) previewStickerHelper2.LL.gg0(C751340Tdc.class));
                            return;
                        }
                        if (i3 != 0) {
                            if (i3 != 1) {
                                return;
                            }
                            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                            C0UFI.LJIIIZ(str);
                            return;
                        }
                        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                        C0UFI.LJIL(str);
                        return;
                    }
                    if (i3 != 0 || !SupportBillboardOverlaySetting.INSTANCE.enable()) {
                        return;
                    }
                    ((C769050UEt) this.LL.LLJILJILJ.getValue()).LIZIZ(str);
                    return;
                }
                C781270Ukn.LJI().showEffectTextInputDialog(this.LL.LL, new C762040Tus(i2, i3, str), AFwS245S0000000_12.get$arr$(212));
            }
        };
        this.LLJILLL = r2;
        C768910UEf c768910UEf = new C768910UEf(this);
        this.LLJJ = c768910UEf;
        dataChannel.BQ2(lifecycleOwner, StickerCancelChannel.class, new AwS591S0100000_12(this, 1049));
        dataChannel.BQ2(lifecycleOwner, NewInsertStickerEvent.class, new AwS591S0100000_12(this, 1050));
        dataChannel.BQ2(lifecycleOwner, NoNewInsertStickerInPreviewEvent.class, new AwS591S0100000_12(this, 1051));
        dataChannel.BQ2(lifecycleOwner, SelectH5StickerInPreview.class, new AwS591S0100000_12(this, 1052));
        if (C781270Ukn.LJI().getEffectMessageHandler() != null) {
            C0UA1.LIZ().Dr(C768430UCj.LIZJ);
        }
        C781270Ukn.LJI().releaseNaviAvatarResources();
        C768970UEl c768970UEl = new C768970UEl(c0ujy);
        this.LLJIJIL = c768970UEl;
        lifecycleOwner.getLifecycle().addObserver(this);
        c768970UEl.LIZ(r2);
        InterfaceC768930UEh liveEffectPalletHandler = C781270Ukn.LJI().getLiveEffectPalletHandler(new WeakReference<>(this.LL), new WeakReference<>(fragment), c768970UEl);
        if (liveEffectPalletHandler != null) {
            liveEffectPalletHandler.LJII(new AwS626S0100000_12(this, 63));
            interfaceC768930UEh = liveEffectPalletHandler;
        }
        this.LLJI = interfaceC768930UEh;
        C781270Ukn.LJI().tryRestoreLastUsedSticker(c768910UEf);
        C0UPF c0upfLJ = C771670UOv.LJ();
        if (c0upfLJ != null) {
            c0upfLJ.LIZJ = c768910UEf;
        }
    }
}
