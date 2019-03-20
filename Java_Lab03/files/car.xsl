<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <table border = "1">
                    <tr>
                        <td>manufacturer</td>
                        <td>length</td>
                        <td>weight</td>
                        <td>wheelDrive</td>
                        <td>maxSpeed</td>
                        <td>fuelConsum</td>
                        <td>price</td>
                        <td>capacity</td>
                    </tr>
                    <xsl:for-each select="CarHeavy">
                        <xsl:sort select="price"/>
                        <tr>
                            <td>
                                <xsl:value-of select="manufacturer"/>
                            </td>
                            <td>
                                <xsl:value-of select= "length"/>
                            </td>
                            <td>
                                <xsl:value-of select="weight"/>
                            </td>
                            <td>
                                <xsl:value-of select="wheelDrive"/>
                            </td>
                            <td>
                                <xsl:value-of select="maxSpeed"/>
                            </td>
                            <td>
                                <xsl:value-of select="fuelConsum"/>
                            </td>
                            <td>
                                <xsl:value-of select="price"/>
                            </td>
                            <td>
                                <xsl:value-of select="capacity"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>

                <table border = "1">
                    <tr>
                        <td>manufacturer</td>
                        <td>length</td>
                        <td>weight</td>
                        <td>wheelDrive</td>
                        <td>maxSpeed</td>
                        <td>fuelConsum</td>
                        <td>price</td>
                        <td>seatingPlaces</td>
                    </tr>
                    <xsl:for-each select="CarLight">
                        <xsl:sort select="price"/>
                        <tr>
                            <td>
                                <xsl:value-of select="manufacturer"/>
                            </td>
                            <td>
                                <xsl:value-of select= "length"/>
                            </td>
                            <td>
                                <xsl:value-of select="weight"/>
                            </td>
                            <td>
                                <xsl:value-of select="wheelDrive"/>
                            </td>
                            <td>
                                <xsl:value-of select="maxSpeed"/>
                            </td>
                            <td>
                                <xsl:value-of select="fuelConsum"/>
                            </td>
                            <td>
                                <xsl:value-of select="price"/>
                            </td>
                            <td>
                                <xsl:value-of select="seatingPlaces"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>