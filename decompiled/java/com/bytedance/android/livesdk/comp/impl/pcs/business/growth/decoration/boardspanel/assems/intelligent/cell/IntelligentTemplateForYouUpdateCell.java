package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.cell;

import X.C01GW;
import X.C1324610kZf;
import X.C1815400xLG;
import X.C1815410xLH;
import X.C1815420xLI;
import X.C1815430xLJ;
import X.C1815440xLK;
import X.C1819620xS4;
import X.C197039127h;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1142670fqD;
import X.InterfaceC1891350zJl;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes28.dex */
public final class IntelligentTemplateForYouUpdateCell extends PowerCell<C1815400xLG> {
    public final C01GW LL = C452501pT.LIZIZ(new C1815420xLI(this));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1815410xLH(this));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1815430xLJ(this));
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1815440xLK(this));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.itemView.getLayoutParams().height = -2;
        C786410Ut5.U8((C197039127h) this.LLILZ.getValue(), new View.OnClickListener() { // from class: X.09ga
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context = ((View) this.LL.LLILZ.getValue()).getContext();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://play.google.com/store/apps/details?id=");
                sbLIZ.append(context.getPackageName());
                Uri uri = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
                ILiveHostSandbox iLiveHostSandbox = (ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class);
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setPackage("com.android.vending");
                if (iLiveHostSandbox != null) {
                    iLiveHostSandbox.appendDataFlowId(intent, 1207965953);
                }
                try {
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context);
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXDRolQomd2/Ye6D4o3ufS89j/VMb+6ML+sg+hrOKlPVS9LyU0thEgpcq7sD9HWrJN5P0pTp3HDRlI9BGDtz4shCdCFSZ6T+w==", null));
                } catch (ActivityNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    Intent intent2 = new Intent("android.intent.action.VIEW", uri);
                    if (iLiveHostSandbox != null) {
                        iLiveHostSandbox.appendDataFlowId(intent2, 1207965953);
                    }
                    try {
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent2, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent2, context);
                        C2204961BRm.LJJJJJL(context, intent2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSeODpCZgAi+sxACTDGSjySpEBXDRolQomd2/Ye6D4o3ufS89j/VMb+6ML+sg+hrOKlPVS9LyU0thEgpcq7sD9HWrJN5P0pTp3HDRlI9BGDtz4shCdCFSZ6T+w==", null));
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1815400xLG c1815400xLG = (C1815400xLG) interfaceC1891350zJl;
        super.onBindItemView(c1815400xLG);
        ImageModel imageModel = c1815400xLG.LLILLL;
        if (imageModel != null) {
            final int iLIZIZ = (int) C497740JfY.LIZIZ(120.0f);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_CENTER;
            c1324610kZfLJIIIZ.LJIJI = 0;
            c1324610kZfLJIIIZ.LJIIL = new InterfaceC1142670fqD() { // from class: X.09o5
                @Override // X.InterfaceC1142670fqD
                public final void LIZ() {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZIZ(Animatable animatable) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZLLL(String str, Exception exc) {
                }

                @Override // X.InterfaceC1142670fqD
                public final void LIZJ(int i, int i2, String str) {
                    int width;
                    if (i > 0 && i2 > 0 && (width = ((View) this.LIZ.LL.getValue()).getWidth()) > 0) {
                        int iMin = Math.min((width * i2) / i, iLIZIZ);
                        ImageView imageView = (ImageView) this.LIZ.LL.getValue();
                        ViewGroup.LayoutParams layoutParams = ((View) this.LIZ.LL.getValue()).getLayoutParams();
                        layoutParams.height = iMin;
                        C786410Ut5.c6(imageView, layoutParams);
                    }
                }
            };
            c1324610kZfLJIIIZ.LJJI((View) this.LL.getValue());
        }
        TextView textView = (TextView) this.LLILLJJLI.getValue();
        String strLJIJI = c1815400xLG.LLILZ;
        if (strLJIJI.length() == 0) {
            strLJIJI = C497740JfY.LJIJI(2131851439);
        }
        textView.setText(strLJIJI);
        TextView textView2 = (TextView) this.LLILLL.getValue();
        String strLJIJI2 = c1815400xLG.LL;
        if (strLJIJI2.length() == 0) {
            strLJIJI2 = C497740JfY.LJIJI(2131851438);
        }
        textView2.setText(strLJIJI2);
        TextView textView3 = (TextView) this.LLILZ.getValue();
        String strLJIJI3 = c1815400xLG.LLILZIL;
        if (strLJIJI3.length() == 0) {
            strLJIJI3 = C497740JfY.LJIJI(2131851437);
        }
        textView3.setText(strLJIJI3);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h05, viewGroup, false);
    }
}
