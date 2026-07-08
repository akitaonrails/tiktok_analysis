package com.ss.android.ugc.aweme.compliance.api.services.settings;

import X.C0TON;
import X.C100F;
import X.C19260610Wu;
import X.EnumC1915270zwL;
import X.EnumC191814102i;
import X.InterfaceC191808102c;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface IComplianceSettingsService {
    EnumC191814102i LIZ();

    List<PolicyBodyLinkList> LIZIZ();

    String LIZJ();

    String LIZLLL();

    String LJ();

    boolean LJFF();

    List<String> LJI();

    String LJII();

    boolean LJIIIIZZ();

    void LJIIIZ(ComplianceSetting complianceSetting);

    void LJIIJ();

    boolean LJIIJJI();

    AdPersonalitySettings LJIIL();

    void LJIILIIL();

    boolean LJIILJJIL();

    void LJIILL(C19260610Wu c19260610Wu);

    ComplianceSetting LJIILLIIL();

    boolean LJIIZILJ();

    void LJIJ(String str, InterfaceC191808102c interfaceC191808102c);

    boolean LJIJI();

    void LJIJJ();

    void LJIJJLI(C100F c100f, int i);

    boolean LJIL();

    boolean LJJ();

    void LJJI(boolean z);

    void LJJIFFI(String str, C0TON c0ton);

    boolean LJJII();

    boolean LJJIII();

    void LJJIIJ(ComplianceSetting complianceSetting);

    int LJJIIJZLJL();

    SpannableStringBuilder LJJIIZ(Context context, String str, List<PolicyBodyLinkList> list);

    void LJJIIZI(int i, Integer num, String str, String str2, Map map);

    EnumC1915270zwL LJJIJ();

    void LJJIJIIJI(int i);

    boolean LJJIJIIJIL();
}
