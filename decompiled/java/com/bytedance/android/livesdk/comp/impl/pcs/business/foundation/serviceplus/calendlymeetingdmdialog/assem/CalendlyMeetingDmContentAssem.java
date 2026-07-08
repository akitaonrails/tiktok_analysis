package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeetingdmdialog.assem;

import X.AnonymousClass0558;
import X.C019F;
import X.C0KQ5;
import X.C0KQ6;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C16F5;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C489920JJe;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724750Sbp;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeetingdmdialog.viewmodel.CalendlyMeetingDmVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes8.dex */
public final class CalendlyMeetingDmContentAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJJI;
    public C16F5 LLJJIII;
    public C16F5 LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public C16F5 LLJJJ;
    public LiveIconView LLJJJIL;
    public C16F5 LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public C0KQ5 LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CalendlyMeetingDmContentAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/calendlymeetingdmdialog/viewmodel/CalendlyMeetingDmVM;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CalendlyMeetingDmContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CalendlyMeetingDmVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AnonymousClass0558(c19719912DlLIZ), new C0KQ6(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyj;
    }

    public final C0KQ5 hp() {
        if (this.LLJJL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0KQ5.class, null);
            this.LLJJL = interfaceC1555100qZQLIZIZ != null ? (C0KQ5) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        long j;
        String strLIZIZ;
        long j2;
        String str3;
        String str4;
        super.onViewCreated(view);
        this.LLJJIII = (C16F5) view.findViewById(R.id.d8x);
        this.LLJJIJI = (C16F5) view.findViewById(R.id.d96);
        this.LLJJIJIIJIL = (C16F5) view.findViewById(R.id.d8z);
        this.LLJJIJIL = (C16F5) view.findViewById(R.id.d8y);
        this.LLJJJ = (C16F5) view.findViewById(R.id.d97);
        this.LLJJJIL = (LiveIconView) view.findViewById(R.id.d95);
        this.LLJJJJ = (C16F5) view.findViewById(R.id.d90);
        this.LLJJJJJIL = (ViewGroup) view.findViewById(R.id.d9b);
        this.LLJJJJLIIL = (ViewGroup) view.findViewById(R.id.d9_);
        this.LLJJJIL = (LiveIconView) view.findViewById(R.id.d93);
        C16F5 c16f5 = this.LLJJIII;
        TuxIconDrawable tuxIconDrawable = null;
        if (c16f5 != null) {
            C0KQ5 c0kq5Hp = hp();
            if (c0kq5Hp != null) {
                str4 = c0kq5Hp.LL;
            } else {
                str4 = null;
            }
            c16f5.setText(str4);
        }
        C16F5 c16f52 = this.LLJJIJI;
        if (c16f52 != null) {
            C0KQ5 c0kq5Hp2 = hp();
            if (c0kq5Hp2 != null) {
                str3 = c0kq5Hp2.LLILLJJLI;
            } else {
                str3 = null;
            }
            c16f52.setText(str3);
        }
        C16F5 c16f53 = this.LLJJIJIIJIL;
        long j3 = 0;
        if (c16f53 != null) {
            C0KQ5 c0kq5Hp3 = hp();
            if (c0kq5Hp3 != null) {
                j2 = c0kq5Hp3.LLILLL;
            } else {
                j2 = 0;
            }
            c16f53.setText(C497740JfY.LJIJJ(2131851502, Long.valueOf(j2)));
        }
        C16F5 c16f54 = this.LLJJIJIL;
        if (c16f54 != null) {
            C0KQ5 c0kq5Hp4 = hp();
            if (c0kq5Hp4 != null) {
                j = c0kq5Hp4.LLILZ;
            } else {
                j = 0;
            }
            C0KQ5 c0kq5Hp5 = hp();
            if (c0kq5Hp5 != null) {
                j3 = c0kq5Hp5.LLILZIL;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochSecond(j).atZone(zoneIdSystemDefault);
                ZonedDateTime zonedDateTimeAtZone2 = Instant.ofEpochSecond(j3).atZone(zoneIdSystemDefault);
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("MMM d, yyyy h:mm a", Locale.getDefault());
                DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("h:mm a", Locale.getDefault());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(zonedDateTimeAtZone.format(dateTimeFormatterOfPattern));
                sbLIZ.append(" - ");
                sbLIZ.append(zonedDateTimeAtZone2.format(dateTimeFormatterOfPattern2));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                TimeZone timeZone = TimeZone.getDefault();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy h:mm a", Locale.getDefault());
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("h:mm a", Locale.getDefault());
                simpleDateFormat.setTimeZone(timeZone);
                simpleDateFormat2.setTimeZone(timeZone);
                String str5 = simpleDateFormat.format(new Date(j * 1000));
                String str6 = simpleDateFormat2.format(new Date(j3 * 1000));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str5);
                sbLIZ2.append(" - ");
                sbLIZ2.append(str6);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            c16f54.setText(strLIZIZ);
        }
        LiveIconView liveIconView = this.LLJJJIL;
        if (liveIconView != null) {
            Context context = getContext();
            if (context != null) {
                tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_envelpoe_fill);
            }
            liveIconView.setIcon(tuxIconDrawable);
        }
        C0KQ5 c0kq5Hp6 = hp();
        if (c0kq5Hp6 != null && (str2 = c0kq5Hp6.LLILZLL) != null && str2.length() != 0) {
            C16F5 c16f55 = this.LLJJJ;
            if (c16f55 != null) {
                c16f55.setText(str2);
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLJJJJJIL);
        }
        C0KQ5 c0kq5Hp7 = hp();
        if (c0kq5Hp7 != null && (str = c0kq5Hp7.LLIZ) != null && str.length() != 0) {
            C16F5 c16f56 = this.LLJJJJ;
            if (c16f56 != null) {
                c16f56.setText(str);
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLJJJJLIIL);
        }
        C500260Jjc.LLFFF(view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        assemVMLazy.getValue().setState(new C489920JJe());
    }
}
