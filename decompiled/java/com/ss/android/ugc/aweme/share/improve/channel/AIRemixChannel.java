package com.ss.android.ugc.aweme.share.improve.channel;

import X.AbstractC1375550ltp;
import X.AbstractC21673619ry;
import X.AbstractC21673719rz;
import X.AnonymousClass0956;
import X.C036E;
import X.C054G;
import X.C098200Yq;
import X.C0LOV;
import X.C0M70;
import X.C0M73;
import X.C0M75;
import X.C0M76;
import X.C0M77;
import X.C0M78;
import X.C0M7D;
import X.C0M7W;
import X.C0M7Y;
import X.C0PEM;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1389890mGx;
import X.C189200o6;
import X.C1954807lC;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C445620Hdg;
import X.C445630Hdh;
import X.C563170M6x;
import X.C814420VxA;
import Y.ARunnableS75S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import com.ss.android.ugc.aweme.feed.model.AIRemixInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixChannel extends PureLogicChannel {
    public final Aweme LL;
    public final Context LLILLJJLI;
    public final C0M7D LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public AnonymousClass0956 LLIZ;
    public final C054G LLIZLLLIL;
    public final BPEAHandler LLJ;
    public int LLJI;
    public final C0M70 LLJIJIL;

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LJJLIIIJJI() {
        return true;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "ai_remix";
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final boolean LIZJ() {
        return !this.LLILZIL || this.LLILLL.LIZJ();
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return this.LLILLJJLI.getString(2131846028);
    }

    public final void LIZ(IAIRemixEntranceMobService iAIRemixEntranceMobService) {
        String firstGid;
        String str = this.LLILZ;
        boolean z = !LIZJ();
        String mobName = this.LLJIJIL.getMobName();
        String aid = this.LL.getAid();
        AIRemixInfo aIRemixInfo = this.LL.aiRemixInfo;
        String gamePlay = null;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        AIRemixInfo aIRemixInfo2 = this.LL.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        }
        this.LL.getAwemeType();
        iAIRemixEntranceMobService.LJFF(str, z, mobName, aid, firstGid, gamePlay, this.LL);
    }

    public final void LJ(RecyclerView recyclerView) {
        AbstractC21673619ry adapter;
        AbstractC21673619ry adapter2;
        AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
        recyclerView.setItemAnimator(null);
        try {
            int i = this.LLJI;
            if (i >= 0 && (adapter = recyclerView.getAdapter()) != null && i < adapter.getItemCount() && (adapter2 = recyclerView.getAdapter()) != null) {
                adapter2.notifyItemChanged(this.LLJI);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        HandlerHook.viewPost(recyclerView, new ARunnableS75S0200000_6(recyclerView, itemAnimator, 48));
    }

    @Override // com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
    public final void LJJIIJZLJL(int i) {
        String firstGid;
        String gamePlay;
        this.LLJI = i;
        boolean zLIZJ = LIZJ();
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        String str = this.LLILZ;
        boolean z = !LIZJ();
        String mobName = this.LLJIJIL.getMobName();
        String aid = this.LL.getAid();
        AIRemixInfo aIRemixInfo = this.LL.aiRemixInfo;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        AIRemixInfo aIRemixInfo2 = this.LL.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        } else {
            gamePlay = null;
        }
        this.LL.getAwemeType();
        iAIRemixEntranceMobServiceLIZ.LJIIL(str, z, mobName, aid, firstGid, gamePlay, this.LL);
        if (this.LLILZIL && Intrinsics.LJFF(this.LLILLL.getState().getValue(), C0M78.LIZ)) {
            C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C445630Hdh(this, iAIRemixEntranceMobServiceLIZ, null), 3);
        } else {
            LIZ(iAIRemixEntranceMobServiceLIZ);
        }
        if (!this.LLILZIL || !Intrinsics.LJFF(this.LLILLL.getState().getValue(), C0M78.LIZ)) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        this.LLILZLL = C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C445620Hdg(this, zLIZJ, null), 3);
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        if (context == null) {
            return null;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(0);
        float[] fArr = new float[8];
        int i = 0;
        do {
            fArr[i] = fLIZIZ;
            i++;
        } while (i < 8);
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        final Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a42, context);
        final Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a42, context);
        final Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ads, context);
        final Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ad5, context);
        final Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.ad5, context);
        if (numLIZJ != null && numLIZJ2 != null && numLIZJ3 != null && numLIZJ4 != null && numLIZJ5 != null) {
            shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: X.0GQh
                @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                public final Shader resize(int i2, int i3) {
                    return new LinearGradient(0.0f, 0.0f, i2, i3, new int[]{numLIZJ.intValue(), numLIZJ2.intValue(), numLIZJ3.intValue(), numLIZJ4.intValue(), numLIZJ5.intValue()}, new float[]{0.0f, 0.12f, 0.75f, 0.9f, 1.0f}, Shader.TileMode.CLAMP);
                }
            });
            shapeDrawable.getPaint().setAntiAlias(true);
        }
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(roundRectShape);
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a43, context);
        if (numLIZJ6 != null) {
            final int iArgb = Color.argb(204, (numLIZJ6.intValue() >> 16) & 255, (numLIZJ6.intValue() >> 8) & 255, numLIZJ6.intValue() & 255);
            final int iArgb2 = Color.argb(102, (numLIZJ6.intValue() >> 16) & 255, (numLIZJ6.intValue() >> 8) & 255, numLIZJ6.intValue() & 255);
            shapeDrawable2.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: X.0GQi
                @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                public final Shader resize(int i2, int i3) {
                    return new LinearGradient(i2, 0.0f, 0.0f, i3, new int[]{iArgb, iArgb2, 0}, new float[]{0.0f, 0.2f, 0.5f}, Shader.TileMode.CLAMP);
                }
            });
            shapeDrawable2.getPaint().setAntiAlias(true);
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
        c419910GdJ.LIZ = R.raw.icon_ai_remix_fill;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2, c419910GdJ.LIZ(context)});
        layerDrawable.setLayerSize(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        layerDrawable.setLayerSize(1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        layerDrawable.setLayerSize(2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layerDrawable.setLayerGravity(2, 17);
        return layerDrawable;
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
        String firstGid;
        String gamePlay;
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) {
            CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ2 = C0LOV.LIZ();
            if (creativeToolsBizPluginServiceLIZ2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("airemix_");
                sbLIZ.append(C0M70.SHARE_PANEL.getMobName());
                creativeToolsBizPluginServiceLIZ2.LIZIZ(context, C2188811AlT.LIZIZ(sbLIZ), true);
            }
            return true;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return true;
        }
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        String str = this.LLILZ;
        boolean z = !LIZJ();
        String mobName = this.LLJIJIL.getMobName();
        String aid = this.LL.getAid();
        AIRemixInfo aIRemixInfo = this.LL.aiRemixInfo;
        if (aIRemixInfo != null) {
            firstGid = aIRemixInfo.getFirstGid();
        } else {
            firstGid = null;
        }
        AIRemixInfo aIRemixInfo2 = this.LL.aiRemixInfo;
        if (aIRemixInfo2 != null) {
            gamePlay = aIRemixInfo2.getGamePlay();
        } else {
            gamePlay = null;
        }
        this.LL.getAwemeType();
        iAIRemixEntranceMobServiceLIZ.LIZIZ(str, z, mobName, aid, firstGid, gamePlay, this.LL);
        C0M73.LIZ().LJIIIIZZ(this.LL.getAid(), this.LLILLL.getState().getValue());
        if (!this.LLILZIL) {
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131846104);
                c1389890mGx.LJIIJJI();
            }
            return true;
        }
        C0M75 value = this.LLILLL.getState().getValue();
        if (Intrinsics.LJFF(value, C0M78.LIZ)) {
            this.LLIZ = C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C0M7W(context, this, activityLIZ, c0m7y, null), 3);
        } else {
            if (Intrinsics.LJFF(value, C0M76.LIZ)) {
                C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C563170M6x(this, context, new AwS552S0100000_8(c0m7y, 167), null), 3);
                return true;
            }
            if (Intrinsics.LJFF(value, C0M77.LIZ)) {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (C036E.LIZ.LIZIZ()) {
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
                        c1389890mGx2.LJIIIZ(2131846103);
                        c1389890mGx2.LJIIJJI();
                        return true;
                    }
                } else if (activityLIZ != null) {
                    C1389890mGx c1389890mGx3 = new C1389890mGx(activityLIZ);
                    c1389890mGx3.LJIIIZ(2131857244);
                    c1389890mGx3.LJIIJJI();
                    return true;
                }
            } else {
                throw new C1954807lC();
            }
        }
        return true;
    }

    public AIRemixChannel(Aweme aweme, Context context, C0M7D c0m7d, String str, boolean z) {
        this.LL = aweme;
        this.LLILLJJLI = context;
        this.LLILLL = c0m7d;
        this.LLILZ = str;
        this.LLILZIL = z;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLIZLLLIL = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
        this.LLJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJI = -1;
        this.LLJIJIL = C0M70.SHARE_PANEL;
    }
}
