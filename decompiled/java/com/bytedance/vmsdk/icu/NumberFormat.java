package com.bytedance.vmsdk.icu;

import X.C1D71;
import X.C20129013pQ;
import X.C20129113pR;
import X.C20129213pS;
import X.C20129313pT;
import X.C20129413pU;
import X.C2190821Aoi;
import X.C2190831Aoj;
import X.C2192861As0;
import X.C2260051Dd5;
import X.C317550Ccb;
import X.EnumC199645139n;
import X.EnumC2259921Dcs;
import X.EnumC2259941Dcu;
import X.EnumC2259971Dcx;
import X.EnumC2259981Dcy;
import X.EnumC2259991Dcz;
import X.EnumC2260001Dd0;
import X.EnumC2260041Dd4;
import X.InterfaceC2190701AoW;
import X.InterfaceC2260031Dd3;
import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public class NumberFormat {
    public static String[] s_sanctionedSimpleUnitIdentifiers = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};
    public InterfaceC2260031Dd3 mPlatformNumberFormatter;
    public EnumC2260041Dd4 mResolvedCompactDisplay;
    public String mResolvedCurrency;
    public InterfaceC2190701AoW<?> mResolvedLocaleObject;
    public InterfaceC2190701AoW<?> mResolvedLocaleObjectForResolvedOptions;
    public EnumC2259981Dcy mResolvedNotation;
    public String mResolvedNumberingSystem;
    public EnumC2259971Dcx mResolvedStyle;
    public String mResolvedUnit;
    public EnumC2260001Dd0 mResolvedUnitDisplay;
    public C1D71 mRoundingType;
    public boolean mUseDefaultNumberSystem;
    public EnumC2259941Dcu mResolvedCurrencyDisplay = EnumC2259941Dcu.SYMBOL;
    public EnumC2259991Dcz mResolvedCurrencySign = EnumC2259991Dcz.STANDARD;
    public boolean mGroupingUsed = true;
    public int mResolvedMinimumIntegerDigits = -1;
    public int mResolvedMinimumFractionDigits = -1;
    public int mResolvedMaximumFractionDigits = -1;
    public int mResolvedMinimumSignificantDigits = -1;
    public int mResolvedMaximumSignificantDigits = -1;
    public EnumC2259921Dcs mResolvedSignDisplay = EnumC2259921Dcs.AUTO;

    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.mResolvedLocaleObjectForResolvedOptions.LIZJ());
        linkedHashMap.put("numberingSystem", this.mResolvedNumberingSystem);
        linkedHashMap.put("style", this.mResolvedStyle.toString());
        EnumC2259971Dcx enumC2259971Dcx = this.mResolvedStyle;
        if (enumC2259971Dcx == EnumC2259971Dcx.CURRENCY) {
            linkedHashMap.put("currency", this.mResolvedCurrency);
            linkedHashMap.put("currencyDisplay", this.mResolvedCurrencyDisplay.toString());
            linkedHashMap.put("currencySign", this.mResolvedCurrencySign.toString());
        } else if (enumC2259971Dcx == EnumC2259971Dcx.UNIT) {
            linkedHashMap.put("unit", this.mResolvedUnit);
            linkedHashMap.put("unitDisplay", this.mResolvedUnitDisplay.toString());
        }
        int i = this.mResolvedMinimumIntegerDigits;
        if (i != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i));
        }
        C1D71 c1d71 = this.mRoundingType;
        if (c1d71 == C1D71.SIGNIFICANT_DIGITS) {
            int i2 = this.mResolvedMaximumSignificantDigits;
            if (i2 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i2));
            }
            int i3 = this.mResolvedMinimumSignificantDigits;
            if (i3 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i3));
            }
        } else if (c1d71 == C1D71.FRACTION_DIGITS) {
            int i4 = this.mResolvedMinimumFractionDigits;
            if (i4 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i4));
            }
            int i5 = this.mResolvedMaximumFractionDigits;
            if (i5 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i5));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.mGroupingUsed));
        linkedHashMap.put("notation", this.mResolvedNotation.toString());
        if (this.mResolvedNotation == EnumC2259981Dcy.COMPACT) {
            linkedHashMap.put("compactDisplay", this.mResolvedCompactDisplay.toString());
        }
        linkedHashMap.put("signDisplay", this.mResolvedSignDisplay.toString());
        return linkedHashMap;
    }

    private boolean isLocaleIdType(String str) {
        return C2192861As0.LIZJ(0, str.length() - 1, str, 3, 8);
    }

    private boolean isSanctionedSimpleUnitIdentifier(String str) {
        if (Arrays.binarySearch(s_sanctionedSimpleUnitIdentifiers, str) >= 0) {
            return true;
        }
        return false;
    }

    private boolean isWellFormedCurrencyCode(String str) {
        return normalizeCurrencyCode(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean isWellFormedUnitIdentifier(String str) {
        if (isSanctionedSimpleUnitIdentifier(str)) {
            return true;
        }
        int iIndexOf = str.indexOf("-per-");
        if (iIndexOf >= 0 && str.indexOf("-per-", iIndexOf + 1) < 0 && isSanctionedSimpleUnitIdentifier(str.substring(0, iIndexOf)) && isSanctionedSimpleUnitIdentifier(str.substring(iIndexOf + 5))) {
            return true;
        }
        return false;
    }

    private String normalizeCurrencyCode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private void setNumberFormatUnitOptions(Map<String, Object> map) throws C20129013pQ, C317550Ccb {
        EnumC199645139n enumC199645139n = EnumC199645139n.STRING;
        this.mResolvedStyle = (EnumC2259971Dcx) C20129113pR.LIZJ(EnumC2259971Dcx.class, C20129113pR.LIZIZ(map, "style", enumC199645139n, new String[]{"decimal", "percent", "currency", "unit"}, "decimal"));
        C20129413pU c20129413pU = C20129313pT.LIZ;
        Object objLIZIZ = C20129113pR.LIZIZ(map, "currency", enumC199645139n, c20129413pU, c20129413pU);
        if (objLIZIZ instanceof C20129413pU) {
            if (this.mResolvedStyle == EnumC2259971Dcx.CURRENCY) {
                throw new C317550Ccb("Expected currency style !");
            }
        } else if (!isWellFormedCurrencyCode((String) objLIZIZ)) {
            throw new C20129013pQ("Malformed currency code !");
        }
        Object objLIZIZ2 = C20129113pR.LIZIZ(map, "currencyDisplay", enumC199645139n, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object objLIZIZ3 = C20129113pR.LIZIZ(map, "currencySign", enumC199645139n, new String[]{"accounting", "standard"}, "standard");
        Object objLIZIZ4 = C20129113pR.LIZIZ(map, "unit", enumC199645139n, c20129413pU, c20129413pU);
        if (objLIZIZ4 instanceof C20129413pU) {
            if (this.mResolvedStyle == EnumC2259971Dcx.UNIT) {
                throw new C20129013pQ("Expected unit !");
            }
        } else if (!isWellFormedUnitIdentifier((String) objLIZIZ4)) {
            throw new C20129013pQ("Malformed unit identifier !");
        }
        Object objLIZIZ5 = C20129113pR.LIZIZ(map, "unitDisplay", enumC199645139n, new String[]{"long", "short", "narrow"}, "short");
        EnumC2259971Dcx enumC2259971Dcx = this.mResolvedStyle;
        if (enumC2259971Dcx == EnumC2259971Dcx.CURRENCY) {
            this.mResolvedCurrency = normalizeCurrencyCode((String) objLIZIZ);
            this.mResolvedCurrencyDisplay = (EnumC2259941Dcu) C20129113pR.LIZJ(EnumC2259941Dcu.class, objLIZIZ2);
            this.mResolvedCurrencySign = (EnumC2259991Dcz) C20129113pR.LIZJ(EnumC2259991Dcz.class, objLIZIZ3);
        } else {
            if (enumC2259971Dcx != EnumC2259971Dcx.UNIT) {
                return;
            }
            this.mResolvedUnit = (String) objLIZIZ4;
            this.mResolvedUnitDisplay = (EnumC2260001Dd0) C20129113pR.LIZJ(EnumC2260001Dd0.class, objLIZIZ5);
        }
    }

    public String format(double d) {
        return this.mPlatformNumberFormatter.LIZIZ(d);
    }

    public List<Map<String, String>> formatToParts(double d) {
        String strLJIIJJI;
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorLIZ = this.mPlatformNumberFormatter.LIZ(d);
        StringBuilder sb = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorLIZ.first(); cFirst != 65535; cFirst = attributedCharacterIteratorLIZ.next()) {
            sb.append(cFirst);
            if (attributedCharacterIteratorLIZ.getIndex() + 1 == attributedCharacterIteratorLIZ.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it2 = attributedCharacterIteratorLIZ.getAttributes().keySet().iterator();
                if (it2.hasNext()) {
                    strLJIIJJI = this.mPlatformNumberFormatter.LJIIJJI(it2.next(), d);
                } else {
                    strLJIIJJI = "literal";
                }
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strLJIIJJI);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public NumberFormat(List<String> list, Map<String, Object> map) throws C20129013pQ, C317550Ccb {
        String str;
        if (Build.VERSION.SDK_INT >= 24) {
            this.mPlatformNumberFormatter = new InterfaceC2260031Dd3() { // from class: X.1Dd1
                public Format LIZ;
                public NumberFormat LIZIZ;
                public C2190541AoG LIZJ;
                public EnumC2259971Dcx LIZLLL;
                public MeasureUnit LJ;

                @Override // X.InterfaceC2260031Dd3
                public final AttributedCharacterIterator LIZ(double d) {
                    try {
                        Format format = this.LIZ;
                        if ((format instanceof MeasureFormat) && this.LJ != null) {
                            return format.formatToCharacterIterator(new Measure(Double.valueOf(d), this.LJ));
                        }
                        return format.formatToCharacterIterator(Double.valueOf(d));
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        try {
                            return NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d));
                        } catch (RuntimeException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d));
                        }
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        return NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d));
                    }
                }

                @Override // X.InterfaceC2260031Dd3
                public final String LIZIZ(double d) {
                    try {
                        Format format = this.LIZ;
                        if ((format instanceof MeasureFormat) && this.LJ != null) {
                            return format.format(new Measure(Double.valueOf(d), this.LJ));
                        }
                        return format.format(Double.valueOf(d));
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        try {
                            return NumberFormat.getInstance(ULocale.getDefault()).format(d);
                        } catch (RuntimeException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d);
                        }
                    }
                }

                @Override // X.InterfaceC2260031Dd3
                public final String LIZJ(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
                    return NumberingSystem.getInstance((ULocale) interfaceC2190701AoW.getLocale()).getName();
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LIZLLL(boolean z) {
                    this.LIZIZ.setGroupingUsed(z);
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJII(int i) {
                    if (i != -1) {
                        this.LIZIZ.setMinimumIntegerDigits(i);
                    }
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJIIJ(EnumC2259921Dcs enumC2259921Dcs) {
                    NumberFormat numberFormat = this.LIZIZ;
                    if (numberFormat instanceof DecimalFormat) {
                        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                        int i = C2259931Dct.LIZ[enumC2259921Dcs.ordinal()];
                        if (i != 1) {
                            if (i == 2 || i == 3) {
                                if (!decimalFormat.getNegativePrefix().isEmpty()) {
                                    decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                                }
                                if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                                    decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                                    return this;
                                }
                            }
                        } else {
                            decimalFormat.setPositivePrefix("");
                            decimalFormat.setPositiveSuffix("");
                            decimalFormat.setNegativePrefix("");
                            decimalFormat.setNegativeSuffix("");
                            return this;
                        }
                    }
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJIIIIZZ(String str2, EnumC2260001Dd0 enumC2260001Dd0) throws C20129013pQ {
                    if (this.LIZLLL == EnumC2259971Dcx.UNIT) {
                        for (MeasureUnit measureUnit : MeasureUnit.getAvailable()) {
                            if (!measureUnit.getSubtype().equals(str2)) {
                                String subtype = measureUnit.getSubtype();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(measureUnit.getType());
                                sbLIZ.append("-");
                                sbLIZ.append(str2);
                                if (subtype.equals(C2188811AlT.LIZIZ(sbLIZ))) {
                                }
                            }
                            this.LJ = measureUnit;
                            C2190541AoG c2190541AoG = this.LIZJ;
                            c2190541AoG.LJI();
                            this.LIZ = MeasureFormat.getInstance(c2190541AoG.LIZ, enumC2260001Dd0.getFormatWidth(), this.LIZIZ);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Unknown unit: ");
                        sbLIZ2.append(str2);
                        throw new C20129013pQ(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJIIIZ(String str2, EnumC2259941Dcu enumC2259941Dcu) throws C20129013pQ {
                    if (this.LIZLLL == EnumC2259971Dcx.CURRENCY) {
                        Currency currency = Currency.getInstance(str2);
                        this.LIZIZ.setCurrency(currency);
                        if (enumC2259941Dcu != EnumC2259941Dcu.CODE) {
                            C2190541AoG c2190541AoG = this.LIZJ;
                            c2190541AoG.LJI();
                            str2 = currency.getName(c2190541AoG.LIZ, enumC2259941Dcu.getNameStyle(), (boolean[]) null);
                        }
                        NumberFormat numberFormat = this.LIZIZ;
                        if (numberFormat instanceof DecimalFormat) {
                            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                            decimalFormatSymbols.setCurrencySymbol(str2);
                            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                        }
                    }
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final String LJIIJJI(AttributedCharacterIterator.Attribute attribute, double d) {
                    if (attribute == NumberFormat.Field.SIGN) {
                        if (Double.compare(d, 0.0d) >= 0) {
                            return "plusSign";
                        }
                        return "minusSign";
                    }
                    if (attribute == NumberFormat.Field.INTEGER) {
                        if (Double.isNaN(d)) {
                            return "nan";
                        }
                        if (Double.isInfinite(d)) {
                            return "infinity";
                        }
                        return "integer";
                    }
                    if (attribute == NumberFormat.Field.FRACTION) {
                        return "fraction";
                    }
                    if (attribute == NumberFormat.Field.EXPONENT) {
                        return "exponentInteger";
                    }
                    if (attribute == NumberFormat.Field.EXPONENT_SIGN) {
                        return "exponentMinusSign";
                    }
                    if (attribute == NumberFormat.Field.EXPONENT_SYMBOL) {
                        return "exponentSeparator";
                    }
                    if (attribute == NumberFormat.Field.DECIMAL_SEPARATOR) {
                        return "decimal";
                    }
                    if (attribute == NumberFormat.Field.GROUPING_SEPARATOR) {
                        return "group";
                    }
                    if (attribute == NumberFormat.Field.PERCENT) {
                        return "percentSign";
                    }
                    if (attribute == NumberFormat.Field.PERMILLE) {
                        return "permilleSign";
                    }
                    if (attribute == NumberFormat.Field.CURRENCY) {
                        return "currency";
                    }
                    if (attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)")) {
                        return "compact";
                    }
                    return "literal";
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJ(C1D71 c1d71, int i, int i2) throws C20129013pQ {
                    NumberFormat numberFormat = this.LIZIZ;
                    if ((numberFormat instanceof DecimalFormat) && c1d71 == C1D71.SIGNIFICANT_DIGITS) {
                        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                        if (i >= 0) {
                            decimalFormat.setMinimumSignificantDigits(i);
                        }
                        if (i2 >= 0) {
                            if (i2 >= decimalFormat.getMinimumSignificantDigits()) {
                                decimalFormat.setMaximumSignificantDigits(i2);
                            } else {
                                throw new C20129013pQ("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                            }
                        }
                        decimalFormat.setSignificantDigitsUsed(true);
                    }
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJI(C1D71 c1d71, int i, int i2) {
                    if (c1d71 == C1D71.FRACTION_DIGITS) {
                        if (i >= 0) {
                            this.LIZIZ.setMinimumFractionDigits(i);
                        }
                        if (i2 >= 0) {
                            this.LIZIZ.setMaximumFractionDigits(i2);
                        }
                        NumberFormat numberFormat = this.LIZIZ;
                        if (numberFormat instanceof DecimalFormat) {
                            ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
                        }
                    }
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJFF(InterfaceC2190701AoW interfaceC2190701AoW, String str2, EnumC2259971Dcx enumC2259971Dcx, EnumC2259991Dcz enumC2259991Dcz, EnumC2259981Dcy enumC2259981Dcy, EnumC2260041Dd4 enumC2260041Dd4) throws C20129013pQ {
                    CompactDecimalFormat.CompactStyle compactStyle;
                    if (!str2.isEmpty()) {
                        try {
                            if (NumberingSystem.getInstanceByName(str2) != null) {
                                ArrayList<String> arrayList = new ArrayList<>();
                                arrayList.add(str2);
                                interfaceC2190701AoW.LJFF("nu", arrayList);
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Invalid numbering system: ");
                                sbLIZ.append(str2);
                                throw new C20129013pQ(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } catch (RuntimeException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Invalid numbering system: ");
                            sbLIZ2.append(str2);
                            throw new C20129013pQ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    if (enumC2259981Dcy == EnumC2259981Dcy.COMPACT && (enumC2259971Dcx == EnumC2259971Dcx.DECIMAL || enumC2259971Dcx == EnumC2259971Dcx.UNIT)) {
                        if (enumC2260041Dd4 == EnumC2260041Dd4.SHORT) {
                            compactStyle = CompactDecimalFormat.CompactStyle.SHORT;
                        } else {
                            compactStyle = CompactDecimalFormat.CompactStyle.LONG;
                        }
                        CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance((ULocale) interfaceC2190701AoW.getLocale(), compactStyle);
                        this.LIZIZ = compactDecimalFormat;
                        this.LIZ = compactDecimalFormat;
                        this.LIZJ = (C2190541AoG) interfaceC2190701AoW;
                        this.LIZLLL = enumC2259971Dcx;
                        compactDecimalFormat.setRoundingMode(4);
                        return this;
                    }
                    NumberFormat numberFormat = NumberFormat.getInstance((ULocale) interfaceC2190701AoW.getLocale(), enumC2259971Dcx.getInitialNumberFormatStyle(enumC2259981Dcy, enumC2259991Dcz));
                    if (enumC2259981Dcy == EnumC2259981Dcy.ENGINEERING) {
                        numberFormat.setMaximumIntegerDigits(3);
                    }
                    this.LIZIZ = numberFormat;
                    this.LIZ = numberFormat;
                    this.LIZJ = (C2190541AoG) interfaceC2190701AoW;
                    this.LIZLLL = enumC2259971Dcx;
                    numberFormat.setRoundingMode(4);
                    return this;
                }
            };
        } else {
            this.mPlatformNumberFormatter = new InterfaceC2260031Dd3() { // from class: X.1Dd2
                public Format LIZ;
                public java.text.DecimalFormat LIZIZ;
                public C2192801Aru LIZJ;
                public EnumC2259971Dcx LIZLLL;

                @Override // X.InterfaceC2260031Dd3
                public final String LIZJ(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
                    return "latn";
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJ(C1D71 c1d71, int i, int i2) {
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJIIIIZZ(String str2, EnumC2260001Dd0 enumC2260001Dd0) {
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final String LJIIJJI(AttributedCharacterIterator.Attribute attribute, double d) {
                    return "literal";
                }

                @Override // X.InterfaceC2260031Dd3
                public final AttributedCharacterIterator LIZ(double d) {
                    return this.LIZ.formatToCharacterIterator(Double.valueOf(d));
                }

                @Override // X.InterfaceC2260031Dd3
                public final String LIZIZ(double d) {
                    return this.LIZ.format(Double.valueOf(d));
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LIZLLL(boolean z) {
                    this.LIZIZ.setGroupingUsed(z);
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJII(int i) {
                    if (i != -1) {
                        this.LIZIZ.setMinimumIntegerDigits(i);
                    }
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJIIJ(EnumC2259921Dcs enumC2259921Dcs) {
                    if (enumC2259921Dcs == EnumC2259921Dcs.NEVER) {
                        this.LIZIZ.setPositivePrefix("");
                        this.LIZIZ.setPositiveSuffix("");
                        this.LIZIZ.setNegativePrefix("");
                        this.LIZIZ.setNegativeSuffix("");
                    }
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJIIIZ(String str2, EnumC2259941Dcu enumC2259941Dcu) throws C20129013pQ {
                    if (this.LIZLLL == EnumC2259971Dcx.CURRENCY) {
                        java.util.Currency currency = java.util.Currency.getInstance(str2);
                        this.LIZIZ.setCurrency(currency);
                        int i = C2259951Dcv.LIZ[enumC2259941Dcu.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                C2192801Aru c2192801Aru = this.LIZJ;
                                c2192801Aru.LJI();
                                str2 = currency.getSymbol(c2192801Aru.LIZ);
                            }
                        } else {
                            C2192801Aru c2192801Aru2 = this.LIZJ;
                            c2192801Aru2.LJI();
                            str2 = currency.getDisplayName(c2192801Aru2.LIZ);
                        }
                        java.text.DecimalFormatSymbols decimalFormatSymbols = this.LIZIZ.getDecimalFormatSymbols();
                        decimalFormatSymbols.setCurrencySymbol(str2);
                        this.LIZIZ.setDecimalFormatSymbols(decimalFormatSymbols);
                        this.LIZIZ.getDecimalFormatSymbols().setCurrencySymbol(str2);
                    }
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJI(C1D71 c1d71, int i, int i2) {
                    if (c1d71 == C1D71.FRACTION_DIGITS) {
                        if (i >= 0) {
                            this.LIZIZ.setMinimumFractionDigits(i);
                        }
                        if (i2 >= 0) {
                            this.LIZIZ.setMaximumFractionDigits(i2);
                        }
                    }
                    return this;
                }

                @Override // X.InterfaceC2260031Dd3
                public final InterfaceC2260031Dd3 LJFF(InterfaceC2190701AoW interfaceC2190701AoW, String str2, EnumC2259971Dcx enumC2259971Dcx, EnumC2259991Dcz enumC2259991Dcz, EnumC2259981Dcy enumC2259981Dcy, EnumC2260041Dd4 enumC2260041Dd4) {
                    java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance((Locale) interfaceC2190701AoW.getLocale());
                    numberFormat.setRoundingMode(RoundingMode.HALF_UP);
                    java.text.DecimalFormat decimalFormat = (java.text.DecimalFormat) numberFormat;
                    this.LIZIZ = decimalFormat;
                    this.LIZ = decimalFormat;
                    this.LIZJ = (C2192801Aru) interfaceC2190701AoW;
                    this.LIZLLL = enumC2259971Dcx;
                    return this;
                }
            };
        }
        initializeNumberFormat(list, map);
        InterfaceC2260031Dd3 interfaceC2260031Dd3 = this.mPlatformNumberFormatter;
        InterfaceC2190701AoW<?> interfaceC2190701AoW = this.mResolvedLocaleObject;
        if (this.mUseDefaultNumberSystem) {
            str = "";
        } else {
            str = this.mResolvedNumberingSystem;
        }
        interfaceC2260031Dd3.LJFF(interfaceC2190701AoW, str, this.mResolvedStyle, this.mResolvedCurrencySign, this.mResolvedNotation, this.mResolvedCompactDisplay);
        interfaceC2260031Dd3.LJIIIZ(this.mResolvedCurrency, this.mResolvedCurrencyDisplay);
        interfaceC2260031Dd3.LIZLLL(this.mGroupingUsed);
        interfaceC2260031Dd3.LJII(this.mResolvedMinimumIntegerDigits);
        interfaceC2260031Dd3.LJ(this.mRoundingType, this.mResolvedMinimumSignificantDigits, this.mResolvedMaximumSignificantDigits);
        interfaceC2260031Dd3.LJI(this.mRoundingType, this.mResolvedMinimumFractionDigits, this.mResolvedMaximumFractionDigits);
        interfaceC2260031Dd3.LJIIJ(this.mResolvedSignDisplay);
        interfaceC2260031Dd3.LJIIIIZZ(this.mResolvedUnit, this.mResolvedUnitDisplay);
    }

    private void initializeNumberFormat(List<String> list, Map<String, Object> map) throws C20129013pQ, C317550Ccb {
        Double d;
        Double d2;
        int defaultFractionDigits;
        HashMap map2 = new HashMap();
        EnumC199645139n enumC199645139n = EnumC199645139n.STRING;
        C20129313pT.LIZIZ(map2, "localeMatcher", C20129113pR.LIZIZ(map, "localeMatcher", enumC199645139n, C2260051Dd5.LIZ, "best fit"));
        C20129413pU c20129413pU = C20129313pT.LIZ;
        Object objLIZIZ = C20129113pR.LIZIZ(map, "numberingSystem", enumC199645139n, c20129413pU, c20129413pU);
        if (!(objLIZIZ instanceof C20129413pU) && !isLocaleIdType((String) objLIZIZ)) {
            throw new C20129013pQ("Invalid numbering system !");
        }
        C20129313pT.LIZIZ(map2, "nu", objLIZIZ);
        HashMap mapLIZ = C2190821Aoi.LIZ(map2, list, Collections.singletonList("nu"));
        InterfaceC2190701AoW<?> interfaceC2190701AoW = (InterfaceC2190701AoW) mapLIZ.get("locale");
        this.mResolvedLocaleObject = interfaceC2190701AoW;
        this.mResolvedLocaleObjectForResolvedOptions = interfaceC2190701AoW.LIZIZ();
        Object objLIZ = C20129313pT.LIZ(mapLIZ, "nu");
        if (!(objLIZ instanceof C20129213pS)) {
            this.mUseDefaultNumberSystem = false;
            this.mResolvedNumberingSystem = (String) objLIZ;
        } else {
            this.mUseDefaultNumberSystem = true;
            this.mResolvedNumberingSystem = this.mPlatformNumberFormatter.LIZJ(this.mResolvedLocaleObject);
        }
        setNumberFormatUnitOptions(map);
        if (this.mResolvedStyle == EnumC2259971Dcx.CURRENCY) {
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    defaultFractionDigits = Currency.getInstance(this.mResolvedCurrency).getDefaultFractionDigits();
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C20129013pQ("Invalid currency code !");
                }
            } else {
                try {
                    defaultFractionDigits = java.util.Currency.getInstance(this.mResolvedCurrency).getDefaultFractionDigits();
                } catch (IllegalArgumentException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new C20129013pQ("Invalid currency code !");
                }
            }
            double d3 = defaultFractionDigits;
            d = new Double(d3);
            d2 = new Double(d3);
        } else {
            d = new Double(0.0d);
            if (this.mResolvedStyle == EnumC2259971Dcx.PERCENT) {
                d2 = new Double(0.0d);
            } else {
                d2 = new Double(3.0d);
            }
        }
        this.mResolvedNotation = (EnumC2259981Dcy) C20129113pR.LIZJ(EnumC2259981Dcy.class, C20129113pR.LIZIZ(map, "notation", enumC199645139n, new String[]{"standard", "scientific", "engineering", "compact"}, "standard"));
        setNumberFormatDigitOptions(map, d, d2);
        Object objLIZIZ2 = C20129113pR.LIZIZ(map, "compactDisplay", enumC199645139n, new String[]{"short", "long"}, "short");
        if (this.mResolvedNotation == EnumC2259981Dcy.COMPACT) {
            this.mResolvedCompactDisplay = (EnumC2260041Dd4) C20129113pR.LIZJ(EnumC2260041Dd4.class, objLIZIZ2);
        }
        this.mGroupingUsed = ((Boolean) C20129113pR.LIZIZ(map, "useGrouping", EnumC199645139n.BOOLEAN, c20129413pU, new Boolean(true))).booleanValue();
        this.mResolvedSignDisplay = (EnumC2259921Dcs) C20129113pR.LIZJ(EnumC2259921Dcs.class, C20129113pR.LIZIZ(map, "signDisplay", enumC199645139n, new String[]{"auto", "never", "always", "exceptZero"}, "auto"));
    }

    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String str = (String) C20129113pR.LIZIZ(map, "localeMatcher", EnumC199645139n.STRING, C2260051Dd5.LIZ, "best fit");
        String[] strArr = new String[list.size()];
        if (Build.VERSION.SDK_INT >= 24 && str.equals("best fit")) {
            return Arrays.asList(C2190831Aoj.LIZJ((String[]) list.toArray(strArr)));
        }
        return Arrays.asList(C2190831Aoj.LJ((String[]) list.toArray(strArr)));
    }

    private void setNumberFormatDigitOptions(Map<String, Object> map, Object obj, Object obj2) throws C20129013pQ {
        Object objLIZ = C20129113pR.LIZ(C20129313pT.LIZ(map, "minimumIntegerDigits"), new Double(1.0d), new Double(21.0d), new Double(1.0d));
        Object objLIZ2 = C20129313pT.LIZ(map, "minimumFractionDigits");
        Object objLIZ3 = C20129313pT.LIZ(map, "maximumFractionDigits");
        Object objLIZ4 = C20129313pT.LIZ(map, "minimumSignificantDigits");
        Object objLIZ5 = C20129313pT.LIZ(map, "maximumSignificantDigits");
        this.mResolvedMinimumIntegerDigits = (int) Math.floor(C20129313pT.LIZJ(objLIZ));
        if ((objLIZ4 instanceof C20129413pU) && (objLIZ5 instanceof C20129413pU)) {
            if ((objLIZ2 instanceof C20129413pU) && (objLIZ3 instanceof C20129413pU)) {
                EnumC2259981Dcy enumC2259981Dcy = this.mResolvedNotation;
                if (enumC2259981Dcy == EnumC2259981Dcy.COMPACT) {
                    this.mRoundingType = C1D71.COMPACT_ROUNDING;
                    return;
                }
                if (enumC2259981Dcy == EnumC2259981Dcy.ENGINEERING) {
                    this.mRoundingType = C1D71.FRACTION_DIGITS;
                    this.mResolvedMaximumFractionDigits = 5;
                    return;
                } else {
                    this.mRoundingType = C1D71.FRACTION_DIGITS;
                    this.mResolvedMinimumFractionDigits = (int) Math.floor(C20129313pT.LIZJ(obj));
                    this.mResolvedMaximumFractionDigits = (int) Math.floor(C20129313pT.LIZJ(obj2));
                    return;
                }
            }
            this.mRoundingType = C1D71.FRACTION_DIGITS;
            Object objLIZ6 = C20129113pR.LIZ(objLIZ2, new Double(0.0d), new Double(20.0d), obj);
            Object objLIZ7 = C20129113pR.LIZ(objLIZ3, objLIZ6, new Double(20.0d), new Double(Math.max(C20129313pT.LIZJ(objLIZ6), C20129313pT.LIZJ(obj2))));
            this.mResolvedMinimumFractionDigits = (int) Math.floor(C20129313pT.LIZJ(objLIZ6));
            this.mResolvedMaximumFractionDigits = (int) Math.floor(C20129313pT.LIZJ(objLIZ7));
            return;
        }
        this.mRoundingType = C1D71.SIGNIFICANT_DIGITS;
        Object objLIZ8 = C20129113pR.LIZ(objLIZ4, new Double(1.0d), new Double(21.0d), new Double(1.0d));
        Object objLIZ9 = C20129113pR.LIZ(objLIZ5, objLIZ8, new Double(21.0d), new Double(21.0d));
        this.mResolvedMinimumSignificantDigits = (int) Math.floor(C20129313pT.LIZJ(objLIZ8));
        this.mResolvedMaximumSignificantDigits = (int) Math.floor(C20129313pT.LIZJ(objLIZ9));
    }
}
